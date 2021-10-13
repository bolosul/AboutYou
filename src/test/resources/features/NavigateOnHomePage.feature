
@wip
  Feature: navigation easy test

    Scenario Outline: verify if customer is able to nvaigate to "<tab>"
      Given customer is on login page
      When customer clicks on  desired "<tab>"
      Then user should land on desired "<url>"

      Examples:
        |tab        |url|
        |Outfits    |https://www.aboutyou.de/frauen/outfits|
        |Stories    |https://www.aboutyou.de/frauen/stories|
        |Bekleidung |https://www.aboutyou.de/c/frauen/bekleidung-20204|
        |Schuhe     |https://www.aboutyou.de/c/frauen/schuhe-20207|
        |Sport      |https://www.aboutyou.de/c/frauen/sport-78100|
        |Accessoires|https://www.aboutyou.de/c/frauen/accessoires-20203|
        |Premium    |https://www.aboutyou.de/c/frauen/premium-144187|
        |Beauty     |https://www.aboutyou.de/c/frauen/beauty-236008|
        |SALE       |https://www.aboutyou.de/c/frauen/sale-32543|
        |Second Love|https://www.aboutyou.de/c/frauen/second-love-516479|
        | Marken    |https://www.aboutyou.de/marke?category=20201|