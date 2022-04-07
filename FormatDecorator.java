/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cpit252_lab06;


public abstract class FormatDecorator extends BaseLogger {
	BaseLogger logger;
	// All format decorators have to reimplement the getLabel method
	public abstract String getLabel();
}
