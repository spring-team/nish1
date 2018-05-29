// No need to say 'I can do it.' You ARE doing it!

// It’s only a thought, and a thought can be changed.

// No need to say 'I can do it.' You ARE doing it!

// You are the delta in what you do, not the things you did in the past

// I believe in you. You can do the thing!

// I believe in you. You can do the thing!

// Our bodies and minds are capable of far more than our psyche will let us achieve.

/*
 * Copyright © 2018 Atomist, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ippon;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
class Nish1Controller {

    @RequestMapping(method = GET, path = "/")
    public String root() {
        return "Spring Boot REST service running in the Woolshed Melbourne (after coffee), Served by " + getClass().getName();
    }

    @RequestMapping(method = GET, path = "hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

}
