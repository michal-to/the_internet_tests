Feature: Cloud Testing Project - POC - 3

  Scenario: Go to the Internet home page 3
    When user is on The Internet home page
    Then the page title is "The Internet"

  Scenario: Go to the Internet sub page "abtest"
    When user is on following sub page "abtest"
    Then the page contains text "No A/B Test"

  Scenario: Go to the Internet sub page "disappearing_elements"
    When user is on following sub page "disappearing_elements"
    Then the page contains text "Disappearing Elements"

  Scenario: Go to the Internet sub page "drag_and_drop"
    When user is on following sub page "drag_and_drop"
    Then the page contains text "Drag and Drop"

  Scenario: Go to the Internet sub page "dropdown"
    When user is on following sub page "dropdown"
    Then the page contains text "Dropdown"

  Scenario: Go to the Internet sub page "dynamic_content"
    When user is on following sub page "dynamic_content"
    Then the page contains text "Dynamic Content"

  Scenario: Go to the Internet sub page "broken_images"
    When user is on following sub page "broken_images"
    Then the page contains text "Broken Images"

  Scenario: Go to the Internet sub page "challenging_dom"
    When user is on following sub page "challenging_dom"
    Then the page contains text "Challenging DOM"

  Scenario: Go to the Internet sub page "checkboxes"
    When user is on following sub page "checkboxes"
    Then the page contains text "Checkboxes"

  Scenario: Go to the Internet sub page "context_menu"
    When user is on following sub page "context_menu"
    Then the page contains text "Context Menu"

  Scenario: Go to the Internet sub page "add_remove_elements"
    When user is on following sub page "add_remove_elements/"
    Then the page contains text "Add/Remove Elements"

  Scenario: Go to the Internet sub page "dynamic_controls"
    When user is on following sub page "dynamic_controls"
    Then the page contains text "Dynamic Controls"