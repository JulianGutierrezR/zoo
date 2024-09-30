package view;

import controller.ZooController;
import model.Animal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZooView {
    private JFrame frame;
    private JTextArea textArea;
    private JTextField animalField;
    private JButton addButton;
    private ZooController controller;

    public ZooView(ZooController controller) {
        this.controller = controller;
        frame = new JFrame("Zoo Information System");
        textArea = new JTextArea(20, 50);
        animalField = new JTextField(20);
        addButton = new JButton("Add Animal");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String animalData = animalField.getText();
                // Suponiendo que los datos se ingresan en un formato específico
                String[] data = animalData.split(",");
                if (data.length == 9) {
                    Animal animal = new Animal(data[0], data[1], data[2], 
                                               data[3], data[4], data[5], 
                                               Integer.parseInt(data[6]), 
                                               data[7], data[8]);
                    controller.addAnimal(animal);
                    updateAnimalList();
                } else {
                    JOptionPane.showMessageDialog(frame, "Please enter all animal data correctly.");
                }
                animalField.setText("");
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Enter Animal Data (commonName, scientificName, family, id, species, gender, birthYear, countryOfOrigin, continent)"));
        frame.add(animalField);
        frame.add(addButton);
        frame.add(new JScrollPane(textArea));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void updateAnimalList() {
        textArea.setText(""); // Clear current list
        for (Animal animal : controller.getAnimals()) {
            textArea.append(animal.getCommonName() + "\n");
        }
    }
}
