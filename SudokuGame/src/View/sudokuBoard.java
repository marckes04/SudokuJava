/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class sudokuBoard extends JPanel {
    
    private JTextField[][] listTxt;
    private int txtWidth;
    private int txtHeight;
    private int txtMargin;
    private int txtLetterSize;
    private Color panelBackground;
    private Color txtBackground1;
    private Color txtForeground1;
    private Color txtBackground2;
    private Color txtForeground2;
    private Color txtBackground3;
    private Color txtForeground3;
    
    public sudokuBoard() {
        initializeComponents();
    }
    
    public void initializeComponents() {
        listTxt = new JTextField[9][9];
        txtWidth = 35;
        txtHeight = 36;
        txtMargin = 4;
        txtLetterSize = 27;
        panelBackground = Color.BLACK;
        txtBackground1 = Color.WHITE;
        txtForeground1 = Color.BLACK;
        txtBackground2 = Color.WHITE;
        txtForeground2 = Color.BLACK;
        txtBackground3 = Color.WHITE;
        txtForeground3 = Color.BLACK;
        
    }
    
    public void createSudoku() {
        this.setLayout(null);
        this.setSize(txtWidth * 9 + (txtMargin * 4), txtHeight * 9 + (txtMargin * 4));
        this.setBackground(panelBackground);
    }
    
    public JTextField[][] getListTxt() {
        return listTxt;
    }
    
    public void setListTxt(JTextField[][] listTxt) {
        this.listTxt = listTxt;
    }
    
    public int getTxtWidth() {
        return txtWidth;
    }
    
    public void setTxtWidth(int txtWidth) {
        this.txtWidth = txtWidth;
    }
    
    public int getTxtHeight() {
        return txtHeight;
    }
    
    public void setTxtHeight(int txtHeight) {
        this.txtHeight = txtHeight;
    }
    
    public int getTxtMargin() {
        return txtMargin;
    }
    
    public void setTxtMargin(int txtMargin) {
        this.txtMargin = txtMargin;
    }
    
    public int getTxtLetterSize() {
        return txtLetterSize;
    }
    
    public void setTxtLetterSize(int txtLetterSize) {
        this.txtLetterSize = txtLetterSize;
    }
    
    public Color getPanelBackground() {
        return panelBackground;
    }
    
    public void setPanelBackground(Color panelBackground) {
        this.panelBackground = panelBackground;
    }
    
    public Color getTxtBackground1() {
        return txtBackground1;
    }
    
    public void setTxtBackground1(Color txtBackground1) {
        this.txtBackground1 = txtBackground1;
    }
    
    public Color getTxtForeground1() {
        return txtForeground1;
    }
    
    public void setTxtForeground1(Color txtForeground1) {
        this.txtForeground1 = txtForeground1;
    }
    
    public Color getTxtBackground2() {
        return txtBackground2;
    }
    
    public void setTxtBackground2(Color txtBackground2) {
        this.txtBackground2 = txtBackground2;
    }
    
    public Color getTxtForeground2() {
        return txtForeground2;
    }
    
    public void setTxtForeground2(Color txtForeground2) {
        this.txtForeground2 = txtForeground2;
    }
    
    public Color getTxtBackground3() {
        return txtBackground3;
    }
    
    public void setTxtBackground3(Color txtBackground3) {
        this.txtBackground3 = txtBackground3;
    }
    
    public Color getTxtForeground3() {
        return txtForeground3;
    }
    
    public void setTxtForeground3(Color txtForeground3) {
        this.txtForeground3 = txtForeground3;
    }
    
}
