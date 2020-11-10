/*
 * Copyright (c) 2020, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation. Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.netbeans.jemmy.operators;

import org.testng.annotations.Test;

import java.awt.TextComponent;
import java.awt.TextField;

import static org.testng.Assert.assertEquals;

public class TextComponentOperatorTest {
    @Test
    public void selection() {
        TextComponent text = new TextField("0123456789");
        TextComponentOperator textOper = new TextComponentOperator(text);
        assertEquals(textOper.getDump().get(TextComponentOperator.SELECTED_TEXT_DPROP), "");
        text.select(1,1);
        assertEquals(textOper.getDump().get(TextComponentOperator.SELECTED_TEXT_DPROP), "");
        text.select(1,2);
        assertEquals(textOper.getDump().get(TextComponentOperator.SELECTED_TEXT_DPROP), "1");
    }
}