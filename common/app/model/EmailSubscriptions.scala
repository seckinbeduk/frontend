package model

case class EmailSubscriptions(subscriptions: List[EmailSubscription])
case class EmailSubscription(
  name: String,
  theme: String,
  about: String,
  description: String,
  frequency: String,
  listId: String,
  subscribedTo: Boolean = false,
  signupPage: Option[String] = None,
  exampleUrl: Option[String] = None
)

object EmailSubscription {
  def apply(emailSubscription: EmailSubscription) = emailSubscription
}

object EmailSubscriptions {

  def newsEmails(subscribedListIds: Iterable[String] = None) = List(
    EmailSubscription(
      name = "The Guardian today - UK",
      theme = "news",
      about = "News",
      description = "Our editors' picks for the day's top news and commentary delivered to your inbox each morning.",
      frequency = "Every day",
      listId = "37",
      subscribedTo = subscribedListIds.exists{ x => x == "37" },
      signupPage = Some("https://www.theguardian.com/info/2015/dec/08/daily-email-uk")
    ),
    EmailSubscription(
      "The Guardian today - US",
      "news",
      "News",
      "Our editors' picks for the day's top news and commentary delivered to your inbox each morning.",
      "Every day",
      "1493",
      subscribedTo = subscribedListIds.exists{ x => x == "1493" },
      signupPage = Some("https://www.theguardian.com/info/2015/dec/08/daily-email-uk"),
      exampleUrl = Some("https://www.theguardian.com/us-news/series/guardian-us-briefing/latest/email")
    ),
    EmailSubscription(
      "The Guardian today - AUS",
      "news",
      "News",
      "Our editors' picks for the day's top news and commentary delivered to your inbox each weekday.",
      "Every day",
      "1506",
      subscribedTo = subscribedListIds.exists{ x => x == "1506" },
      signupPage = Some("https://www.theguardian.com/world/guardian-australia-morning-mail/2014/jun/24/-sp-guardian-australias-morning-mail-subscribe-by-email")
    ),
    EmailSubscription(
      "Weekend reading",
      "news",
      "News",
      "The best stuff you didn't have time to read during the week - from features and news analysis to lifestyle and culture.",
      "Every Saturday",
      "3744",
      subscribedTo = subscribedListIds.exists{ x => x == "3743" || x == "3744" },
      signupPage = Some("https://www.theguardian.com/signup/weekendreading"),
      exampleUrl = Some("http://www.theguardian.com/membership/series/weekend-reading/latest/email")

    ),
    EmailSubscription(
      "Media briefing",
      "news",
      "Media",
      "An indispensable summary of what the papers are saying about media on your desktop before 9am. We summarise the media headlines in every newspaper from the Wall Street Journal to the Daily Star.",
      "Weekday mornings",
      "217",
      subscribedTo = subscribedListIds.exists{ x => x == "217" }
    ),
    EmailSubscription(
      "Brexit briefing",
      "news",
      "News",
      "Get a weekly rundown of the debates and developments as Britain starts out on the long road to leaving the European Union.",
      "Tuesday mornings",
      "3698",
      subscribedTo = subscribedListIds.exists{ x => x == "3698" },
      exampleUrl = Some("http://www.theguardian.com/politics/series/eu-referendum-morning-briefing/latest/email")
    ),
    EmailSubscription(
      "Green light",
      "news",
      "Environment",
      "In each weekly edition our editors highlight the most important environment stories of the week including data, opinion pieces and background guides. We'll also flag up our best video, picture galleries, podcasts, blogs and green living guides.",
      "Every Friday",
      "38",
      subscribedTo = subscribedListIds.exists{ x => x == "38" },
      exampleUrl = Some("http://www.theguardian.com/environment/series/green-light/latest/email")
    ),
    EmailSubscription(
      "Lab notes",
      "news",
      "Science",
      "Get a weekly round-up of the biggest stories in science, insider knowledge from our network of bloggers, and some distractingly good fun and games.",
      "Every Friday",
      "3701",
      subscribedTo = subscribedListIds.exists{ x => x == "3701" },
      exampleUrl = Some("https://www.theguardian.com/science/series/lab-notes/latest/email")
    ),
    EmailSubscription(
      "Poverty matters",
      "news",
      "Global development",
      "Our editors track what's happening in development with a special focus on the millennium development goals. Sign up to get all the most important debate and discussion from around the world delivered to your inbox every fortnight.",
      "Every other Tuesday",
      "113",
      subscribedTo = subscribedListIds.exists{ x => x == "113" },
      exampleUrl = Some("http://www.theguardian.com/global-development/series/poverty-matters/latest/email")
    ),
    EmailSubscription(
      "The Long Read",
      "news",
      "The week’s Long Reads and audio features",
      "Bringing you the latest Long Read features and podcasts, delivered to your inbox.",
      "Every Saturday",
      "3322",
      subscribedTo = subscribedListIds.exists{ x => x == "3322" }
    ),
    EmailSubscription(
      "Morning Mail",
      "news",
      "Guardian Australia's morning news briefing from around the web",
      "Get ahead with a shot of early morning news - our editors bring you everything you need",
      "Every weekday",
      "2636",
      subscribedTo = subscribedListIds.exists{ x => x == "2636" }
    ),
    EmailSubscription(
      "Australian politics",
      "news",
      "Politics",
      "All the latest news and comment on Australian politics from the Guardian, delivered to you every weekday.",
      "Weekdays at 10am",
      "1866",
      subscribedTo = subscribedListIds.exists{ x => x == "1866" }
    )
  )

  def sportEmails(subscribedListIds: Iterable[String] = None) = List(
    EmailSubscription(
      "The Fiver",
      "sport",
      "Football",
      "The Fiver is theguardian.com/sport's free football email. Every weekday we round up the day's news and gossip in our own belligerent, sometimes intelligent and — very occasionally — funny way. The Fiver is delivered every Monday to Friday at around 5pm — hence the name.",
      "Weekday afternoons",
      "218",
      subscribedTo = subscribedListIds.exists{ x => x == "218" },
      exampleUrl = Some("https://www.theguardian.com/football/series/thefiver/latest/email")
    ),
    EmailSubscription(
      "The Breakdown",
      "sport",
      "Rugby Union",
      "Sign up for our rugby union email, written by our rugby correspondent Paul Rees. Every Thursday Paul will give his thoughts on the big stories, review the latest action and provide gossip from behind the scenes in his unique and indomitable style.",
      "Every Thursday",
      "219",
      subscribedTo = subscribedListIds.exists{ x => x == "219" },
      exampleUrl = Some("http://www.theguardian.com/sport/series/breakdown/latest/email")
    ),
    EmailSubscription(
      "The Spin",
      "sport",
      "Cricket",
      "The Spin brings you all the latest comment and news, rumour and humour from the world of cricket every Tuesday. It promises not to use tired old cricket cliches, but it might just bowl you over.",
      "Every Tuesday",
      "220",
      subscribedTo = subscribedListIds.exists{ x => x == "220" },
      exampleUrl = Some("http://www.theguardian.com/sport/series/thespin/latest/email")
    )
  )

  def cultureEmails(subscribedListIds: Iterable[String] = None) = List(
    EmailSubscription(
      "Sleeve notes",
      "culture",
      "Music",
      "Everything you need to know from the Guardian's music site, squeezed into one handy email.",
      "Every Friday",
      "39",
      subscribedTo = subscribedListIds.exists{ x => x == "39" }
    ),
    EmailSubscription(
      "Close up",
      "culture",
      "Film",
      "Rely on Close up to bring you Guardian film news, reviews and much, much more.",
      "Every Friday",
      "40",
      subscribedTo = subscribedListIds.exists{ x => x == "40" }
    ),
    EmailSubscription(
      "Film Today",
      "culture",
      "Film",
      "Our film editors recap the top headlines each weekday and deliver them straight to your inbox in time for your evening commute.",
      "Every weekday",
      "1950",
      subscribedTo = subscribedListIds.exists{ x => x == "1950" }
    ),
    EmailSubscription(
      "Bookmarks",
      "culture",
      "Weekly email from the books team",
      "A weekly email from the books team with our pick of the latest news, views and reviews, delivered to your inbox.",
      "Every Thursday",
      "3039",
      subscribedTo = subscribedListIds.exists{ x => x == "3039" }
    ),
    EmailSubscription(
      "Art Weekly",
      "culture",
      "Art and design",
      "For your art world low-down, sign up to the Guardian's Art Weekly email and get all the latest news, reviews and comment delivered straight to your inbox.",
      "Every Friday",
      "99",
      subscribedTo = subscribedListIds.exists{ x => x == "99" },
      exampleUrl = Some("http://www.theguardian.com/artanddesign/series/art-weekly/latest/email")
    )
  )

  def lifestyleEmails(subscribedListIds: Iterable[String] = None) = List(
    EmailSubscription(
      "Zip file",
      "lifestyle",
      "Technology",
      "For all you need to know about technology in the world this week, news, analysis and comment.",
      "Every Thursday",
      "1902",
      subscribedTo = subscribedListIds.exists{ x => x == "1902" }
    ),
    EmailSubscription(
      "The Flyer",
      "lifestyle",
      "Travel",
      "Sign up to The Flyer for all the latest travel stories, plus find links to hundreds of UK hotel and restaurant reviews; insider tips on the world's best cities; a road-tripper's guide to the US; and highlights of our most inspiring top 10s.",
      "Every Wednesday",
      "2211",
      subscribedTo = subscribedListIds.exists{ x => x == "2211" }
    ),
    EmailSubscription(
      "Money Talks",
      "lifestyle",
      "Money",
      "Stay on top of the best personal finance and money news of the week, including insight and behind-the-scenes accounts from your favourite Guardian Money editors.",
      "Every Thursday",
      "1079",
      subscribedTo = subscribedListIds.exists{ x => x == "1079" },
      exampleUrl = Some("http://www.theguardian.com/money/series/money-talks/latest/email")
    ),
    EmailSubscription(
      "Fashion statement",
      "lifestyle",
      "Fashion",
      "The Guardian sorts the wheat from the chaff to deliver the latest news, views and shoes from the style frontline.",
      "Every Monday",
      "105",
      subscribedTo = subscribedListIds.exists{ x => x == "105" }
    ),
    EmailSubscription(
      "Crossword editor's update",
      "lifestyle",
      "Crosswords",
      "Register to receive our monthly crossword email by the Guardian's crossword editor with the latest issues and tips about theguardian.com/crosswords.",
      "Monthly",
      "101",
      subscribedTo = subscribedListIds.exists{ x => x == "101" },
      exampleUrl = Some("https://www.theguardian.com/crosswords/series/crossword-editor-update/latest/email")
    ),
    EmailSubscription(
      "The Observer Food Monthly",
      "lifestyle",
      "Food & Drink",
      "Sign up to the Observer Food Monthly newsletter for all your food and drink news, tips, offers, recipes and competitions.",
      "Monthly",
      "248",
      subscribedTo = subscribedListIds.exists{ x => x == "248" }
    )
  )

  def commentEmails(subscribedListIds: Iterable[String] = None) = List(
    EmailSubscription(
      "Best of Guardian Opinion - UK",
      "comment",
      "Opinion's daily email newsletter",
      "Guardian Opinion's daily email newsletter with the most shared opinion, analysis and editorial articles from the last 24 hours — sign up to read, share and join the debate every afternoon.",
      "Weekday afternoons",
      "2313",
      subscribedTo = subscribedListIds.exists{ x => x == "2313" }
    ),
    EmailSubscription(
      "Best of Guardian Opinion - US",
      "comment",
      "Opinion's daily email newsletter",
      "Guardian Opinion's daily email newsletter with the most shared opinion, analysis and editorial articles from the last 24 hours — sign up to read, share and join the debate every afternoon.",
      "Weekday afternoons",
      "3228",
      subscribedTo = subscribedListIds.exists{ x => x == "3228" }
    ),
    EmailSubscription(
      "Best of Guardian Opinion - AUS",
      "comment",
      "An evening selection of the best reads from Guardian Opinion in Australia",
      "An evening selection of the best reads from Guardian Opinion in Australia",
      "Daily",
      "2976",
      subscribedTo = subscribedListIds.exists{ x => x == "2976" }
    ),
    EmailSubscription(
      "First Dog on the Moon",
      "comment",
      "Cartoons from Guardian Australia's resident Walkley-winning cartoonist",
      "Subscribe to First Dog on the Moon to get his cartoons straight to your inbox every time they're published",
      "About three times a week",
      "2635",
      subscribedTo = subscribedListIds.exists{ x => x == "2635" }
    )
  )

  def apply(subscribedListIds: Iterable[String] = None): EmailSubscriptions = EmailSubscriptions(List(

  ) ++ newsEmails(subscribedListIds) ++ sportEmails(subscribedListIds) ++ cultureEmails(subscribedListIds) ++ lifestyleEmails(subscribedListIds) ++ commentEmails(subscribedListIds))
}