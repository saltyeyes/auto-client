/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.autoclient.PVP_net;

import cz.autoclient.autoclick.Rect;

/**
 *
 * @author Jakub
 */
public class Constants {
  public static final String window_title = "PVP.net Client";
  public static final String process_name = "LolClient.exe";
  public static final String test_process_name = "Annoyance.exe";
  public static final Rect normalSize = new Rect(0, 1152, 720, 0);
  public static double sizeCoeficient(Rect size) {
    //With cold blood, I'll assume these Riot idiots will never allow you to change Client aspect ratio
    return size.right/normalSize.right;
  }
}
