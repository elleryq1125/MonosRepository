package com.example.monos.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.monos.domain.UserDetailsImpl;
import com.example.monos.service.IndexService;

/**
 * サインイン画面およびトップページへの表示を担当する。
 * @author t.ueta
 */
@Controller
@RequestMapping("/")
public class SigninController {
	private final IndexService indexService;

	public SigninController(IndexService indexService) {
		this.indexService = indexService;
	}

	/**
	 * <p>トップページを表示する。</p>
	 * @return index.html
	 */
	@GetMapping
	public String showIndex(@AuthenticationPrincipal UserDetailsImpl signinUser, Model model) {
		var indexSummary = indexService.getIndexSummary(signinUser.getCompanyId());
		model.addAttribute("indexSummary", indexSummary);
		return "index";
	}
	
	/**
	 * <p>サインイン画面を表示する。</p>
	 * @return signin.html
	 */
	@GetMapping("/signin")
	public String showSignin() {
		return "signin";
	}
}
