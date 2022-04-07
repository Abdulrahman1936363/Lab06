/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cpit252_lab06;


public class JSONFormatter extends FormatDecorator {
	public JSONFormatter(BaseLogger logger) {
		this.logger = logger;
	}

	public String getLabel() {
		return logger.getLabel() + ", JSONFormatter";
	}

	public String getLevel() {
		return "Info " + logger.getLevel();
	}
}
