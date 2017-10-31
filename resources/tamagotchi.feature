Feature: Basic needs

Scenario: As a Tamagotchi owner I want to feed my Tamagotchi so that I can satiate it's hunger
Given I have a Tamagotchi
When I feed it
Then it's hungriness is decreased
And it's fullness is increased