#include "HX711.h"
const int LOADCELL_DOUT_PIN = PC_13;
const int LOADCELL_SCK_PIN = PC_6;

HX711 scales;
float factor_calibracion = 21100.00;

void setup() {
    Serial.begin(9600);

    scales.begin(LOADCELL_DOUT_PIN, LOADCELL_SCK_PIN);

    scales.set_scale();
    scales.tare();
}

void loop() {
scales.set_scale(factor_calibracion);

Serial.print("Leyendo: ");
  Serial.print(scales.get_units(1), 4);
  Serial.print(" kgs");
  Serial.print(" factor_calibracion: ");
  Serial.print(factor_calibracion);
  Serial.println();
 
  // Obtener información desde el monitor serie
  if (Serial.available())
  {
    char temp = Serial.read();
    if (temp == '+')
      factor_calibracion += 10;
    else if (temp == '-')
      factor_calibracion -= 10;
  }
}
