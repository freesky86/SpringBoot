package com.freesky.springboot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freesky.bean.Group;

@RestController
@RequestMapping("/api")
public class GroupController {
	private List<Group> list = new ArrayList<>();
	
	protected void buildList() {
		if (!list.isEmpty()) {
			return;
		}
		Group group = new Group();
		group.setId(1L);
		group.setName("Group-1");
		list.add(group);
		
		Group group2 = new Group();
		group2.setId(2L);
		group2.setName("Group-2");
		list.add(group2);
	}

	@GetMapping("/groups")
    Collection<Group> groups() {
		buildList();
        return list;
    }
	
	@GetMapping("/group/{id}")
    ResponseEntity<?> getGroup(@PathVariable Long id) {
		buildList();
		
        Group item = null;
        for (Group child : list) {
        	if(child.getId().equals(id)) {
        		item = child;
        		break;
        	}
        }
        Optional<Group> group = Optional.of(item);
        
        return group.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
