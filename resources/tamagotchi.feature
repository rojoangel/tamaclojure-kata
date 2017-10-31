Feature: Basic needs

Scenario: As a Tamagotchi owner I want to feed my Tamagotchi so that I can satiate it's hunger
Given I have a Tamagotchi
When I feed it
Then its hungriness is decreased
And its fullness is increased