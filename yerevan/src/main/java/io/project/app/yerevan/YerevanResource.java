/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.app.yerevan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author armena
 */
@RestController
@RequestMapping("/api/v2/armenia")
@Slf4j
public class YerevanResource {

    @GetMapping
    @CrossOrigin
    public String getYerevanAge() {
        return "The history of Yerevan dates back to the 8th century BC, with the founding of the fortress of Erebuni in 782 BC by king Argishti I at the western extreme of the Ararat plain.";
    }
}
