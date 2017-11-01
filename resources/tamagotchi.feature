Feature: Basic needs

Scenario: As a Tamagotchi owner I want to feed my Tamagotchi so that I can satiate it's hunger
Given I have a Tamagotchi
When I feed it
Then its hungriness is decreased
And its fullness is increased

Scenario: As a Tamagotchi owner I want to play with my Tamagotchi so that I can make it happier
Given I have a Tamagotchi
When I play with it
Then its happiness is increased
And its tiredness is increased

Scenario: As a Tamagotchi owner I want to put my Tamagotchi to bed so that I can refill it's energy
Given I have a Tamagotchi
When I put it to bed
Then its tiredness is decreased

Scenario: As a Tamagotchi owner I want to make my Tamagotchi poop so that it is more comfortable
Given I have a Tamagotchi
When I make it poop
Then its fullness is decreased

Scenario: As a Tamagotchi owner I want my Tamagotchi's needs to change over time so that I have to look after it carefully
Given I have a Tamagotchi
When time passes
Then its tiredness is increased
And its hungriness is increased
And its happiness is decreased