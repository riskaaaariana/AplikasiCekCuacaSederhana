/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import org.json.JSONObject;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Image;
import java.awt.event.ItemEvent;

/**
 *
 * @author Riska
 */
public class AplikasiCekCuacaSederhana extends javax.swing.JFrame {

    private Map<String, Integer> cityCheckCount = new HashMap<>();
    private DefaultTableModel tableModel;

    /**
     * Creates new form AplikasiCekCuacaSederhana
     */
    public AplikasiCekCuacaSederhana() {
        initComponents();
        tableModel = (DefaultTableModel) dataTable.getModel();
        loadSavedData(); // Load previously saved data
        loadFavorites(); // Load favorite cities
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cuacaLabel = new javax.swing.JLabel();
        cekCuacaButton = new javax.swing.JButton();
        simpanButton = new javax.swing.JButton();
        kotaTextField = new javax.swing.JTextField();
        lokasiComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        iconLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Masukan Kota");

        jLabel2.setText("Pilih Kota");

        cuacaLabel.setText("Hasil Cuaca");

        cekCuacaButton.setText("Cek Cuaca");
        cekCuacaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekCuacaButtonActionPerformed(evt);
            }
        });

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        lokasiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Lokasi" }));
        lokasiComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lokasiComboBoxItemStateChanged(evt);
            }
        });
        lokasiComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lokasiComboBoxActionPerformed(evt);
            }
        });

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kota", "Cuaca", "Suhu"
            }
        ));
        dataTable.setEnabled(false);
        dataTable.setFocusable(false);
        jScrollPane1.setViewportView(dataTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuacaLabel))
                        .addGap(0, 92, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lokasiComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 188, Short.MAX_VALUE)
                                    .addComponent(kotaTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cekCuacaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(simpanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kotaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cekCuacaButton)
                    .addComponent(simpanButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lokasiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cuacaLabel)
                .addGap(18, 18, 18)
                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cekCuacaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekCuacaButtonActionPerformed
        String kota = kotaTextField.getText().trim();
        if (kota.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Silakan masukkan nama kota");
            return;
        }

        // Update check count and add to favorites if checked frequently
        cityCheckCount.put(kota, cityCheckCount.getOrDefault(kota, 0) + 1);
        if (cityCheckCount.get(kota) >= 3) { // Setelah 3 kali dicek
            addToFavorites(kota);
        }

        String apiKey = "7fcfd4f75d211a119ca9eeff8532f936"; // Ganti dengan API key Anda
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + kota + "&appid=" + apiKey + "&units=metric&lang=id";

        try {
            // Mengambil data dari API
            String response = getWeatherData(url);
            JSONObject jsonResponse = new JSONObject(response);

            // Parsing data dari JSON
            String kondisiCuaca = jsonResponse.getJSONArray("weather").getJSONObject(0).getString("description");
            kondisiCuaca = translateWeatherDescription(kondisiCuaca); // Terjemahkan jika perlu
            double suhu = jsonResponse.getJSONObject("main").getDouble("temp");

            // Menampilkan hasil dalam Bahasa Indonesia
            cuacaLabel.setText("Cuaca: " + kondisiCuaca + ", Suhu: " + suhu + "°C");

            // Atur ikon cuaca
            setWeatherIcon(kondisiCuaca);

            // Tambahkan kota ke favorit jika sudah dicek beberapa kali
            cityCheckCount.put(kota, cityCheckCount.getOrDefault(kota, 0) + 1);
            if (cityCheckCount.get(kota) >= 3) {
                addToFavorites(kota);
            }

            // Update table
            updateTableData(kota, kondisiCuaca, suhu);

        } catch (Exception e) {
            cuacaLabel.setText("Kota tidak ditemukan atau error API.");
        }

    }//GEN-LAST:event_cekCuacaButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        String kota = kotaTextField.getText();
        String apiKey = "7fcfd4f75d211a119ca9eeff8532f936"; // Ganti dengan API key Anda
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + kota + "&appid=" + apiKey + "&units=metric";

        try {
            // Mengambil data dari API
            String response = getWeatherData(url);
            JSONObject jsonResponse = new JSONObject(response);

            // Parsing data dari JSON
            String kondisiCuaca = jsonResponse.getJSONArray("weather").getJSONObject(0).getString("description");
            double suhu = jsonResponse.getJSONObject("main").getDouble("temp");

            // Menampilkan hasil
            cuacaLabel.setText("Cuaca: " + kondisiCuaca + ", Suhu: " + suhu + "°C");

            // Tambahkan kota ke daftar favorit jika belum ada
            boolean kotaSudahAda = false;
            for (int i = 0; i < lokasiComboBox.getItemCount(); i++) {
                if (lokasiComboBox.getItemAt(i).equalsIgnoreCase(kota)) {
                    kotaSudahAda = true;
                    break;
                }
            }
            if (!kotaSudahAda) {
                lokasiComboBox.addItem(kota); // Tambahkan kota ke JComboBox
            }

            // Menyimpan data ke file CSV
            try (FileWriter writer = new FileWriter("weatherData.csv", true)) {
                writer.append(kota).append(",").append(kondisiCuaca).append(",").append(String.valueOf(suhu)).append("\n");
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke weatherData.csv.");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Gagal menyimpan data ke file CSV.");
            }

        } catch (Exception e) {
            cuacaLabel.setText("Kota tidak ditemukan atau error API.");
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void lokasiComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lokasiComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String selectedCity = (String) lokasiComboBox.getSelectedItem();
            if (selectedCity != null && !selectedCity.equals("Pilih Lokasi")) {
                kotaTextField.setText(selectedCity);
                // Automatically check weather for selected city
                checkWeatherForCity(selectedCity);
            }
        }
    }//GEN-LAST:event_lokasiComboBoxItemStateChanged

    private void lokasiComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lokasiComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lokasiComboBoxActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuacaSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuacaSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuacaSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuacaSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiCekCuacaSederhana().setVisible(true);
            }
        });
    }

    private String getWeatherData(String urlString) throws Exception {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        return response.toString();
    }

    private String translateWeatherDescription(String description) {
        Map<String, String> translations = new HashMap<>();
        translations.put("clear sky", "Cerah");
        translations.put("few clouds", "Berawan Tipis");
        translations.put("scattered clouds", "Berawan Tersebar");
        translations.put("broken clouds", "Berawan");
        translations.put("shower rain", "Hujan Ringan");
        translations.put("rain", "Hujan");
        translations.put("thunderstorm", "Badai Petir");
        translations.put("snow", "Salju");
        translations.put("mist", "Berkabut");

        return translations.getOrDefault(description.toLowerCase(), description);
    }

    private void setWeatherIcon(String weather) {
        String iconPath = "";
        weather = weather.toLowerCase();
        
        if (weather.contains("cerah")) {
            iconPath = "/icons/sunny.png";
        } else if (weather.contains("berawan tipis") || weather.contains("berawan tersebar")) {
            iconPath = "/icons/partly-cloudy.png";
        } else if (weather.contains("berawan")) {
            iconPath = "/icons/cloudy.png";
        } else if (weather.contains("hujan ringan")) {
            iconPath = "/icons/light-rain.png";
        } else if (weather.contains("hujan")) {
            iconPath = "/icons/rain.png";
        } else if (weather.contains("badai") || weather.contains("petir")) {
            iconPath = "/icons/storm.png";
        } else if (weather.contains("kabut") || weather.contains("berkabut")) {
            iconPath = "/icons/fog.png";
        } else if (weather.contains("salju")) {
            iconPath = "/icons/snow.png";
        } else {
            iconPath = "/icons/default.png";
        }

        try {
            // Load image from resources
            java.net.URL imgURL = getClass().getResource(iconPath);
            if (imgURL != null) {
                ImageIcon icon = new ImageIcon(imgURL);
                // Resize image to fit label (adjust size as needed)
                Image img = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                iconLabel.setIcon(new ImageIcon(img));
            } else {
                System.err.println("Couldn't find file: " + iconPath);
                iconLabel.setIcon(null);
            }
        } catch (Exception e) {
            System.err.println("Error loading weather icon: " + e.getMessage());
            iconLabel.setIcon(null);
        }
    }

    private void addCityToFavoritesIfFrequent(String city) {
        cityCheckCount.put(city, cityCheckCount.getOrDefault(city, 0) + 1);
        if (cityCheckCount.get(city) >= 3) {
            boolean exists = false;
            for (int i = 0; i < lokasiComboBox.getItemCount(); i++) {
                if (city.equals(lokasiComboBox.getItemAt(i))) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                lokasiComboBox.addItem(city);
            }
        }
    }

    private void loadSavedData() {
        try {
            File file = new File("weatherData.csv");
            if (!file.exists()) {
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            tableModel.setRowCount(0);

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    tableModel.addRow(data);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFavorites() {
        try {
            File file = new File("favorites.txt");
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    lokasiComboBox.addItem(line.trim());
                }
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveFavorites() {
        try {
            FileWriter writer = new FileWriter("favorites.txt");
            for (int i = 1; i < lokasiComboBox.getItemCount(); i++) { // Start from 1 to skip "Pilih Lokasi"
                writer.write(lokasiComboBox.getItemAt(i) + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addToFavorites(String city) {
        // Check if city is already in favorites
        for (int i = 0; i < lokasiComboBox.getItemCount(); i++) {
            if (city.equals(lokasiComboBox.getItemAt(i))) {
                return;
            }
        }
        lokasiComboBox.addItem(city);
        saveFavorites();
    }

    private void updateTableData(String kota, String cuaca, double suhu) {
        // Add new row to table
        tableModel.addRow(new Object[]{kota, cuaca, String.format("%.1f°C", suhu)});
        
        // Save to CSV immediately
        try (FileWriter writer = new FileWriter("weatherData.csv", true)) {
            writer.append(String.format("%s,%s,%.1f\n", kota, cuaca, suhu));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void checkWeatherForCity(String kota) {
        String apiKey = "7fcfd4f75d211a119ca9eeff8532f936";
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + kota + "&appid=" + apiKey + "&units=metric&lang=id";

        try {
            String response = getWeatherData(url);
            JSONObject jsonResponse = new JSONObject(response);

            String kondisiCuaca = jsonResponse.getJSONArray("weather").getJSONObject(0).getString("description");
            kondisiCuaca = translateWeatherDescription(kondisiCuaca);
            double suhu = jsonResponse.getJSONObject("main").getDouble("temp");

            cuacaLabel.setText("Cuaca: " + kondisiCuaca + ", Suhu: " + String.format("%.1f°C", suhu));
            setWeatherIcon(kondisiCuaca);
            updateTableData(kota, kondisiCuaca, suhu);

        } catch (Exception e) {
            cuacaLabel.setText("Error mengambil data cuaca untuk " + kota);
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cekCuacaButton;
    private javax.swing.JLabel cuacaLabel;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kotaTextField;
    private javax.swing.JComboBox<String> lokasiComboBox;
    private javax.swing.JButton simpanButton;
    // End of variables declaration//GEN-END:variables
}
