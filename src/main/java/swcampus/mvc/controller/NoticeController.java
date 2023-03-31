package swcampus.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import swcampus.mvc.dto.notice.NoticeDto;
import swcampus.mvc.service.NoticeService;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class NoticeController {

    private final NoticeService noticeService;

    /**
     * 글 등록폼 및 글 등록
     */
    @GetMapping("/insert/{noticeNo}")
    public String noticeForm(@PathVariable("noticeNo") Long noticeNo, @ModelAttribute("notice") NoticeDto noticeDto) {
        return "hello";
    }

    @PostMapping("/insert/{noticeNo}")
    public String insertNotice(@Validated @PathVariable("noticeNo")Long noticeNo,
                               BindingResult bindingResult, NoticeDto noticeDto) {
        if (bindingResult.hasErrors()) {
            log.info("error={}", bindingResult);
            return "hello";
        }

        noticeService.insertNotice(noticeDto);

        return "hello2";
    }

    @GetMapping("/list")
    public String noticeList(Model model) {
        List<NoticeDto> notices = noticeService.findAll();
        model.addAttribute("notices", notices);
        return "/views/board/noticeBoard";
    }

    @GetMapping("/update/{noticeNo}")
    public String updateForm(@PathVariable("noticeNo")Long noticeNo, @ModelAttribute("notice")NoticeDto noticeDto) {
        return "hello";
    }

    @PostMapping("/update/{noticeNo}")
    public String updateNotice(@Validated @PathVariable("noticeNo") Long noticeNo, BindingResult bindingResult, NoticeDto noticeDto) {
        if (bindingResult.hasErrors()) {
            log.info("error={}", bindingResult);
            return "hello";
        }

        NoticeDto notice = noticeService.findNotice(noticeNo);
        noticeService.updateNotice(notice, noticeDto);

        return "redirect:/"; //리스트로 가야됨.
    }


}
