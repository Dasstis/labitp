#include <stdint.h>

// Пины для управления индикаторами
const int clockPin = 2;  // Пин для тактового сигнала
const int resetPin = 3;  // Пин для сброса индикаторов

int currentNumber = 0;  // Текущее число на индикаторе

// Последовательность Коллатца для 28
const int collatzSequence[] = {28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1};
const int sequenceLength = sizeof(collatzSequence) / sizeof(collatzSequence[0]);

// Функция подачи импульсов для отображения числа
void displayNumber(int number) {
  resetIndicators();  // Перед каждым новым числом сбрасываем индикаторы

  for (int i = 0; i < number; i++) {
    digitalWrite(clockPin, HIGH);
    delay(5);
    digitalWrite(clockPin, LOW);
    delay(5);
  }

  currentNumber = number;
}

// Функция сброса индикаторов
void resetIndicators() {
  digitalWrite(resetPin, HIGH);
  delay(10);
  digitalWrite(resetPin, LOW);
  currentNumber = 0;
}

void setup() {
  Serial.begin(9600);
  pinMode(clockPin, OUTPUT);
  pinMode(resetPin, OUTPUT);
  digitalWrite(clockPin, LOW);
  digitalWrite(resetPin, LOW);
  resetIndicators();
}

void loop() {
  for (int i = 0; i < sequenceLength; i++) {
    int number = collatzSequence[i];

    Serial.println(number);  // Вывод в монитор порта
    displayNumber(number);   // Отображение на индикаторах
    delay(1000);             // Задержка для визуализации
  }

  // После завершения ждем перед повторным запуском
  delay(2000);
}



