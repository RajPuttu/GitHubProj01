/*
 * The MIT License - Edited and edited again - new change adjasdj
 *
 * Copyright 2020 Intuit Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.intuit.karate.robot;

/**
 *
 * @author pthomas3
 */
public class Location {

    public Robot robot;
    
    public final int x;
    public final int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Location with(Robot robot) {
        this.robot = robot;
        return this;
    }
    
    public Location move() {
        robot.move(x, y);
        return this;
    }   
    
    public Location click() {
        return click(1);
    }
    
    public Location click(int num) {
        robot.move(x, y).click(num);
        return this;
    }

}line added in master 
<<<<<<< HEAD
new cmt line added in mastwe1 
=======
new line added in branch2 
>>>>>>> RC7_branch
wekj2ie3i0j 
asjjsajdjskjs
