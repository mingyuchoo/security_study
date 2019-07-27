package com.mgchoo.security2.bbs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mgchoo.security2.bbs.entity.Bbs;
import com.mgchoo.security2.bbs.service.BbsService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BbsController {
	private static final Logger logger = LoggerFactory.getLogger(BbsController.class);

	@Resource(name="bbsService")
	private BbsService bbsService;
	
	@RequestMapping(value="/bbs/list.do", method=RequestMethod.GET)
	public String dispBbsList(Model model) {
		logger.info("display view BBS list");
		List<Bbs> list = this.bbsService.getSelect();
		model.addAttribute("list", list);
		logger.info("total count" + list.size());
		
		return "bbs/list";
	}
	
	@RequestMapping("/bbs/{idx}")
	public String dispBbsView(@PathVariable int idx, Model model) {
		logger.info("display view BBS view idx = {}", idx);
		Bbs object = this.bbsService.getSelectOne(idx);
		model.addAttribute("object", object);
		
		return "bbs/view";
	}
	

	@RequestMapping(value="/bbs/write.do", method=RequestMethod.GET)
	public String dispBbsWrite(@RequestParam(value="idx", defaultValue="0") int idx, Model model) {
		logger.info("display view BBS write");
		if (idx > 0) {
			Bbs object = this.bbsService.getSelectOne(idx);
			model.addAttribute("object", object);
		} else  {
		    
		}
		return "bbs/write";
	}

	@RequestMapping(value="/bbs/write_ok.do", method=RequestMethod.POST)
	public String procBbsWrite(@ModelAttribute("bbsVo") Bbs bbsVo, RedirectAttributes redirectAttributes) {
		Integer idx = bbsVo.getIdx();
		
		if (idx == null || idx == 0) {
			this.bbsService.insert(bbsVo);
			redirectAttributes.addFlashAttribute("message", "등록되었습니다.");
			return "redirect:/bbs/list.do";
		} else {
			this.bbsService.update(bbsVo);
			redirectAttributes.addFlashAttribute("message", "수정되었습니다.");
			return "redirect:/bbs/write.do?idx=" + idx;
		}
	}
	
	@RequestMapping(value="/bbs/delete.do", method=RequestMethod.POST)
	public String procBbsDelete(@RequestParam(value="idx", required=false) int idx) {
		this.bbsService.delete(idx);
		
		return "redirect:/bbs/list.do";
	}
	
}
