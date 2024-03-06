package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.dto.ChatRoomRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/chat")
@Log4j2
public class RoomController {
	
	private final ChatRoomRepository repository = new ChatRoomRepository();
	
	@GetMapping(value = "/rooms")
	public ModelAndView rooms() {
		
		//log.info("# All Chat Rooms");
		ModelAndView mv = new ModelAndView("chat/rooms");
		
		mv.addObject("list",repository.findAllRooms());
		
		return mv;
		
	}
	
	@PostMapping(value = "/room")
	public String create(@RequestParam String name, RedirectAttributes rttr) {
		
		rttr.addFlashAttribute("roomName",repository.createChatRoomDTO(name));
		return "redirect:/chat/rooms";
	}
	
	@GetMapping("/room")
	public void getRoom(String roomId, Model model) {
		
		model.addAttribute("room",repository.findRoomById(roomId));
	}
	
	
}
