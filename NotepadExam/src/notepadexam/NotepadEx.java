package notepadexam;


import java.awt.Desktop;
import java.awt.event.ItemEvent;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;
import java.io.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class NotepadEx extends javax.swing.JFrame {

    PrinterJob printerJob;
    String findStr;
    boolean findDown;

    public NotepadEx() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnStatusbar = new javax.swing.JPanel();
        lbStatusBar = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotepad = new javax.swing.JTextArea();
        menubNote = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        itemNew = new javax.swing.JMenuItem();
        itemOpen = new javax.swing.JMenuItem();
        itemSave = new javax.swing.JMenuItem();
        itemSaveas = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemPagesetup = new javax.swing.JMenuItem();
        itemPrint = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemExit = new javax.swing.JMenuItem();
        mnEdit = new javax.swing.JMenu();
        itemUndo = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemCut = new javax.swing.JMenuItem();
        itemCopy = new javax.swing.JMenuItem();
        itemPate = new javax.swing.JMenuItem();
        itemDelete = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itemFind = new javax.swing.JMenuItem();
        itemFindNext = new javax.swing.JMenuItem();
        itemReplace = new javax.swing.JMenuItem();
        itemGoTo = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        itemSelectAll = new javax.swing.JMenuItem();
        itemTimeDate = new javax.swing.JMenuItem();
        mnFormat = new javax.swing.JMenu();
        itemWordWarp = new javax.swing.JCheckBoxMenuItem();
        itemFont = new javax.swing.JMenuItem();
        mnView = new javax.swing.JMenu();
        itemStatusbar = new javax.swing.JCheckBoxMenuItem();
        itemViewHelp = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        itemAboutNotepad = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notepad");

        lbStatusBar.setText("Ln 1, Col 1");

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout pnStatusbarLayout = new javax.swing.GroupLayout(pnStatusbar);
        pnStatusbar.setLayout(pnStatusbarLayout);
        pnStatusbarLayout.setHorizontalGroup(
            pnStatusbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnStatusbarLayout.createSequentialGroup()
                .addContainerGap(561, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbStatusBar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        pnStatusbarLayout.setVerticalGroup(
            pnStatusbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6)
            .addComponent(lbStatusBar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        txtNotepad.setColumns(20);
        txtNotepad.setRows(5);
        txtNotepad.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNotepadCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(txtNotepad);

        menubNote.setBorder(null);

        mnFile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        mnFile.setText("File");
        mnFile.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        itemNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        itemNew.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemNew.setText("New");
        itemNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNewActionPerformed(evt);
            }
        });
        mnFile.add(itemNew);

        itemOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        itemOpen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemOpen.setText("Open...");
        itemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOpenActionPerformed(evt);
            }
        });
        mnFile.add(itemOpen);

        itemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        itemSave.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemSave.setText("Save");
        itemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSaveActionPerformed(evt);
            }
        });
        mnFile.add(itemSave);

        itemSaveas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemSaveas.setText("Save As...");
        itemSaveas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSaveasActionPerformed(evt);
            }
        });
        mnFile.add(itemSaveas);
        mnFile.add(jSeparator2);

        itemPagesetup.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemPagesetup.setText("Page Setup...");
        itemPagesetup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPagesetupActionPerformed(evt);
            }
        });
        mnFile.add(itemPagesetup);

        itemPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        itemPrint.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemPrint.setText("Print...");
        itemPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPrintActionPerformed(evt);
            }
        });
        mnFile.add(itemPrint);
        mnFile.add(jSeparator1);

        itemExit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemExit.setText("Exit");
        itemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExitActionPerformed(evt);
            }
        });
        mnFile.add(itemExit);

        menubNote.add(mnFile);

        mnEdit.setText("Edit");
        mnEdit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnEdit.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mnEditMenuSelected(evt);
            }
        });

        itemUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        itemUndo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemUndo.setText("Undo");
        itemUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUndoActionPerformed(evt);
            }
        });
        mnEdit.add(itemUndo);
        mnEdit.add(jSeparator3);

        itemCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        itemCut.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemCut.setText("Cut");
        itemCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCutActionPerformed(evt);
            }
        });
        mnEdit.add(itemCut);

        itemCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itemCopy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemCopy.setText("Copy");
        itemCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCopyActionPerformed(evt);
            }
        });
        mnEdit.add(itemCopy);

        itemPate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        itemPate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemPate.setText("Pate");
        itemPate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPateActionPerformed(evt);
            }
        });
        mnEdit.add(itemPate);

        itemDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        itemDelete.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemDelete.setText("Delete");
        itemDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeleteActionPerformed(evt);
            }
        });
        mnEdit.add(itemDelete);
        mnEdit.add(jSeparator4);

        itemFind.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        itemFind.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemFind.setText("Find...");
        mnEdit.add(itemFind);

        itemFindNext.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        itemFindNext.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemFindNext.setText("Find Next");
        mnEdit.add(itemFindNext);

        itemReplace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        itemReplace.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemReplace.setText("Replace...");
        mnEdit.add(itemReplace);

        itemGoTo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        itemGoTo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemGoTo.setText("Go To...");
        mnEdit.add(itemGoTo);
        mnEdit.add(jSeparator5);

        itemSelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itemSelectAll.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemSelectAll.setText("Select All");
        itemSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSelectAllActionPerformed(evt);
            }
        });
        mnEdit.add(itemSelectAll);

        itemTimeDate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        itemTimeDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemTimeDate.setText("Time/Date");
        itemTimeDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTimeDateActionPerformed(evt);
            }
        });
        mnEdit.add(itemTimeDate);

        menubNote.add(mnEdit);

        mnFormat.setText("Format");
        mnFormat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        itemWordWarp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemWordWarp.setSelected(true);
        itemWordWarp.setText("Word Warp");
        itemWordWarp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itemWordWarpItemStateChanged(evt);
            }
        });
        itemWordWarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemWordWarpActionPerformed(evt);
            }
        });
        mnFormat.add(itemWordWarp);

        itemFont.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemFont.setText("Font...");
        mnFormat.add(itemFont);

        menubNote.add(mnFormat);

        mnView.setText("View");
        mnView.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnView.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mnViewItemStateChanged(evt);
            }
        });
        mnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnViewActionPerformed(evt);
            }
        });

        itemStatusbar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemStatusbar.setSelected(true);
        itemStatusbar.setText("Status Bar");
        itemStatusbar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itemStatusbarItemStateChanged(evt);
            }
        });
        mnView.add(itemStatusbar);

        menubNote.add(mnView);

        itemViewHelp.setText("Help");
        itemViewHelp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem2.setText("View Help");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        itemViewHelp.add(jMenuItem2);

        itemAboutNotepad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemAboutNotepad.setText("About Notepad");
        itemAboutNotepad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAboutNotepadActionPerformed(evt);
            }
        });
        itemViewHelp.add(itemAboutNotepad);

        menubNote.add(itemViewHelp);

        setJMenuBar(menubNote);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnStatusbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnStatusbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void itemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOpenActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            OpenFile openFile = new OpenFile(txtNotepad, fileChooser.getSelectedFile().getPath());
            openFile.Load();
            this.setTitle(fileChooser.getSelectedFile().getName());
            txtNotepad.getText();

        }

    }//GEN-LAST:event_itemOpenActionPerformed

    private void mnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnViewActionPerformed
        pnStatusbar.setVisible(itemStatusbar.isSelected());
    }//GEN-LAST:event_mnViewActionPerformed

    private void itemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSaveActionPerformed
        if (!txtNotepad.getText().equals("")) {
            if (!true) {
                try {
                    SaveFile saveFile = new SaveFile("", txtNotepad.getText());
                    saveFile.Write();
                } catch (Exception e) {
                }
            } else {
                JFileChooser fileChooser = new JFileChooser();
                if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                    try {
                        SaveFile saveFile = new SaveFile(fileChooser.getSelectedFile().getPath(), txtNotepad.getText());
                        saveFile.Write();
                        setTitle(fileChooser.getSelectedFile().getName());
                    } catch (Exception e) {
                    }
                }
            }
        }

    }//GEN-LAST:event_itemSaveActionPerformed

    private void itemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemExitActionPerformed

    private void itemNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNewActionPerformed
        txtNotepad.setText("");
        this.setTitle("Untitle");
    }//GEN-LAST:event_itemNewActionPerformed

    private void itemPagesetupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPagesetupActionPerformed

        if (printerJob == null) {
            printerJob = PrinterJob.getPrinterJob();
        }
        PageFormat pf = printerJob.pageDialog(printerJob.defaultPage());
        pf.setOrientation(PageFormat.PORTRAIT);


    }//GEN-LAST:event_itemPagesetupActionPerformed

    private void itemPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPrintActionPerformed
        if (printerJob == null) {
            printerJob = PrinterJob.getPrinterJob();
        }
        PrintSupport.printComponent(txtNotepad, printerJob);
    }//GEN-LAST:event_itemPrintActionPerformed

    private void itemSaveasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSaveasActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                SaveFile wf = new SaveFile(fileChooser.getSelectedFile().getPath(), txtNotepad.getText());
                wf.Write();
                setTitle(fileChooser.getSelectedFile().getName());
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_itemSaveasActionPerformed

    private void itemUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUndoActionPerformed
        txtNotepad.setText("");
    }//GEN-LAST:event_itemUndoActionPerformed

    private void itemCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCutActionPerformed
        txtNotepad.getText();
        txtNotepad.cut();
    }//GEN-LAST:event_itemCutActionPerformed

    private void itemCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCopyActionPerformed
        txtNotepad.copy();
    }//GEN-LAST:event_itemCopyActionPerformed

    private void itemPateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPateActionPerformed
        txtNotepad.getText();
        txtNotepad.paste();
    }//GEN-LAST:event_itemPateActionPerformed

    private void itemDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeleteActionPerformed
        txtNotepad.getText();
        txtNotepad.replaceSelection("");
    }//GEN-LAST:event_itemDeleteActionPerformed

    private void itemSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSelectAllActionPerformed
        txtNotepad.selectAll();
    }//GEN-LAST:event_itemSelectAllActionPerformed

    private void itemAboutNotepadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAboutNotepadActionPerformed
        AboutNotepad aboutNotepad = new AboutNotepad(this, true);
        aboutNotepad.setVisible(true);


    }//GEN-LAST:event_itemAboutNotepadActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        openWebpage("https://support.microsoft.com/vi-vn/products/windows?os=windows-10");

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void itemStatusbarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itemStatusbarItemStateChanged
        pnStatusbar.setVisible(itemStatusbar.isSelected());
    }//GEN-LAST:event_itemStatusbarItemStateChanged

    private void mnViewItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mnViewItemStateChanged
        pnStatusbar.setVisible(itemStatusbar.isSelected());
    }//GEN-LAST:event_mnViewItemStateChanged

    private void mnEditMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnEditMenuSelected
        boolean setFind = !"".equals(txtNotepad.getText());
        itemFind.setEnabled(setFind);
        itemFindNext.setEnabled(setFind);
        boolean setEdit = !(txtNotepad.getSelectedText() == null);
        itemCopy.setEnabled(setEdit);
        itemCut.setEnabled(setEdit);
        itemDelete.setEnabled(setEdit);
    }//GEN-LAST:event_mnEditMenuSelected

    private void itemWordWarpItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itemWordWarpItemStateChanged
        txtNotepad.setWrapStyleWord(itemWordWarp.isSelected());
        txtNotepad.setLineWrap(itemWordWarp.isSelected());
        itemStatusbar.setEnabled(!itemWordWarp.isSelected());
        if (itemWordWarp.isSelected()) {
            itemStatusbar.setSelected(false);
        }
    }//GEN-LAST:event_itemWordWarpItemStateChanged

    private void itemTimeDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTimeDateActionPerformed
        Date now = new Date();
        SimpleDateFormat fm = new SimpleDateFormat("hh:mm a dd/MM/yyyy");
        txtNotepad.setText(txtNotepad.getText() + fm.format(now));
    }//GEN-LAST:event_itemTimeDateActionPerformed

    private void txtNotepadCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNotepadCaretUpdate
        if (!itemStatusbar.isSelected()) {
            return;
        }
        int linenum = 1;
        int columnnum = 1;
        try {
            int caretpos = txtNotepad.getCaretPosition();
            linenum = txtNotepad.getLineOfOffset(caretpos);
            columnnum = caretpos - txtNotepad.getLineStartOffset(linenum) + 1;
            linenum++;
        } catch (Exception e) {
        }
        lbStatusBar.setText("Ln " + linenum + ", Col " + columnnum);
    }//GEN-LAST:event_txtNotepadCaretUpdate

    private void itemWordWarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemWordWarpActionPerformed
        itemWordWarp.setSelected(false);
    }//GEN-LAST:event_itemWordWarpActionPerformed

    public static void openWebpage(String urlString) {
        try {
            Desktop.getDesktop().browse(new URL(urlString).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NotepadEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotepadEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotepadEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotepadEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NotepadEx().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAboutNotepad;
    private javax.swing.JMenuItem itemCopy;
    private javax.swing.JMenuItem itemCut;
    private javax.swing.JMenuItem itemDelete;
    private javax.swing.JMenuItem itemExit;
    private javax.swing.JMenuItem itemFind;
    private javax.swing.JMenuItem itemFindNext;
    private javax.swing.JMenuItem itemFont;
    private javax.swing.JMenuItem itemGoTo;
    private javax.swing.JMenuItem itemNew;
    private javax.swing.JMenuItem itemOpen;
    private javax.swing.JMenuItem itemPagesetup;
    private javax.swing.JMenuItem itemPate;
    private javax.swing.JMenuItem itemPrint;
    private javax.swing.JMenuItem itemReplace;
    private javax.swing.JMenuItem itemSave;
    private javax.swing.JMenuItem itemSaveas;
    private javax.swing.JMenuItem itemSelectAll;
    private javax.swing.JCheckBoxMenuItem itemStatusbar;
    private javax.swing.JMenuItem itemTimeDate;
    private javax.swing.JMenuItem itemUndo;
    private javax.swing.JMenu itemViewHelp;
    private javax.swing.JCheckBoxMenuItem itemWordWarp;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lbStatusBar;
    private javax.swing.JMenuBar menubNote;
    private javax.swing.JMenu mnEdit;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenu mnFormat;
    private javax.swing.JMenu mnView;
    private javax.swing.JPanel pnStatusbar;
    private javax.swing.JTextArea txtNotepad;
    // End of variables declaration//GEN-END:variables

    String getFindStr() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setFindStr(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setFindDown(boolean selected) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void open(String wwwgomicrosoftcomfwlinkLinkId517009) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
