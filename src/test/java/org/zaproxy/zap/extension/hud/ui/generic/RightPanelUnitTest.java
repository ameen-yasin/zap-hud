/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2018 The ZAP Development Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zaproxy.zap.extension.hud.ui.generic;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.openqa.selenium.WebDriver;
import org.zaproxy.zap.extension.hud.ui.uimap.HUD;

public class RightPanelUnitTest {

    private static final int EXPECTED_BUTTONS = 8;

    public RightPanelUnitTest() {}

    public static void runAllTests(WebDriver wd) {
        testRightPanelLoads(wd);
        testRightContainsExpectedButtons(wd);
    }

    public static void testRightPanelLoads(WebDriver wd) {
        HUD hud = new HUD(wd);
        assertNotNull(hud.waitForRightPanel());
        wd.switchTo().defaultContent();
    }

    public static void testRightContainsExpectedButtons(WebDriver wd) {
        HUD hud = new HUD(wd);
        hud.waitForHudButtons(HUD.RIGHT_PANEL_BY_ID, EXPECTED_BUTTONS);
        wd.switchTo().defaultContent();
    }
}
