package uz.mobiler.gita.quizapplaunch.repository

import uz.mobiler.gita.quizapplaunch.R
import uz.mobiler.gita.quizapplaunch.models.QuestionData
import java.util.Collections

class QuestionsRepository {
    private val list = mutableListOf<QuestionData>()

    init {
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "What is the square root of 144?",
                "11",
                "10",
                "13",
                "12",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "What is the value of 3³+4²?",
                "35",
                "43",
                "27",
                "25",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "Solve: 5x=45",
                "7",
                "8",
                "9",
                "10",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "What is 25% of 200?",
                "25",
                "40",
                "50",
                "75",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "If x-7=12, find x",
                "19",
                "5",
                "17",
                "21",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "Simplify: 8×(5+3)",
                "40",
                "48",
                "56",
                "64",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "What is the value of 2⁵",
                "16",
                "32",
                "64",
                "128",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "Solve: 18÷3+4",
                "6",
                "10",
                "8",
                "12",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "What is the perimeter of a square with side 6 cm?",
                "12",
                "18",
                "24",
                "36",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "If x=4, find 2x²",
                "32",
                "16",
                "24",
                "8",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "What is the area of a rectangle with height 8 and width 5?",
                "30",
                "40",
                "45",
                "50",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "Solve: 7+3×6",
                "60",
                "42",
                "28",
                "25",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "What is the next number:\n2, 4, 8, 16, _?",
                "18",
                "32",
                "24",
                "30",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "What is the square root of 169?",
                "11",
                "12",
                "13",
                "14",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "Find the next number: 5, 10, 20, 40, ＿",
                "80",
                "60",
                "70",
                "100",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "Solve: 7x=63",
                "6",
                "7",
                "8",
                "9",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.math_bcg,
                "Mathematics",
                "What is the sum of angles in a triangle?",
                "90°",
                "180°",
                "270°",
                "360°",
                1,
                -1
            )
        )

        /////////////////////////////////////////////////////////////////////////////////////////////
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "She ＿ to the gym every morning before work.",
                "go",
                "goes",
                "is going",
                "has gone",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "If I ＿ more time, I would learn another language.",
                "have",
                "had",
                "will",
                "am having",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "He has worked here ＿ 2018.",
                "since",
                "for",
                "from",
                "during",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "This problem is ＿ difficult than the previous one.",
                "most",
                "very",
                "much",
                "more",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "She didn’t have ＿ money to buy\nthe ticket.",
                "many",
                "too",
                "enough",
                "very",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "I was tired, ＿ I continued working.",
                "because",
                "but",
                "so",
                "although",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "The meeting was cancelled ＿ the bad weather.",
                "because of",
                "because",
                "although",
                "despite",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "He speaks English ＿ than his brother.",
                "more fluent",
                "fluently",
                "most fluent",
                "more fluently",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "She asked me where I ＿ from.",
                "am",
                "was",
                "were",
                "have been",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "We were late ＿ there was heavy traffic.",
                "because",
                "although",
                "despite",
                "unless",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "I’ll call you as soon as I ＿ home.",
                "get",
                "will get",
                "got",
                "am getting",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "The book ＿ by millions of people worldwide.",
                "reads",
                "is reading",
                "is read",
                "has read",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "She is not used to ＿ up early.",
                "wake",
                "waking",
                "woke",
                "wakes",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "He suggested ＿ a short break.",
                "take",
                "to take",
                "taking",
                "taken",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "This is the best movie I ＿ seen\nthis year.",
                "have",
                "had",
                "am",
                "was",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "Don’t forget ＿ the door when you leave.",
                "lock",
                "locking",
                "to lock",
                "locked",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "She looks ＿ today than yesterday.",
                "happier",
                "happiest",
                "happy",
                "more happy",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "He didn’t answer the phone, so he ＿ be busy.",
                "must",
                "shouldn’t",
                "can’t",
                "won’t",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "There isn’t ＿ sugar left in the jar.",
                "many",
                "little",
                "few",
                "much",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "Find the translation: Reliable",
                "Yolg`onchi",
                "Ishonchli",
                "Dangasa",
                "Xavfli",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "Find the translation: Improve",
                "Yomonlashmoq",
                "O‘zgartirmoq",
                "Yaxshilamoq",
                "To‘xtatmoq",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "Find the translation: Borrow",
                "Sotib olmoq",
                "Qarz bermoq",
                "Ijaraga olmoq",
                "Qarz olmoq",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "Find the translation: Refuse",
                "Qabul qilmoq",
                "Rad etmoq",
                "Taklif qilmoq",
                "Kutmoq",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "Find the translation: Accident",
                "Reja",
                "Tajriba",
                "Baxtsiz hodisa",
                "Sabab",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "Find the translation: Decision",
                "Qaror",
                "Tanlov",
                "Muammo",
                "Taklif",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.eng_bcg,
                "English",
                "Find the translation: Damage",
                "Foyda",
                "Ta’mir",
                "Zarar",
                "Sovg‘a",
                2,
                -1
            )
        )

        ///////////////////////////////////////////////////////////////////////////////////////////

        list.add(
            QuestionData(
                R.drawable.plant,
                "Science",
                "What do plants need to make food?",
                "Oxygen",
                "Sunlight",
                "Soil",
                "Wind",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.breathe,
                "Science",
                "Which gas do humans breathe in?",
                "Carbon dioxide",
                "Oxygen",
                "Nitrogen",
                "Hydrogen",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.solar_system,
                "Science",
                "What is the center of the Solar System?",
                "Earth",
                "Moon",
                "Sun",
                "Mars",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.ice_cubes,
                "Science",
                "Water freezes at ＿ degrees Celsius.",
                "100",
                "50",
                "10",
                "0",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.organs,
                "Science",
                "Which organ pumps blood in the body?",
                "Brain",
                "Lungs",
                "Heart",
                "Liver",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.solar_system,
                "Science",
                "Which planet is known as the Red Planet?",
                "Mars",
                "Venus",
                "Jupiter",
                "Saturn",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.plant,
                "Science",
                "Which part of the plant is usually underground?",
                "Root",
                "Stem",
                "Flower",
                "Leaf",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.ice_cubes,
                "Science",
                "What do we call the change from water to ice?",
                "Melting",
                "Freezing",
                "Boiling",
                "Evaporation",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.magnetism,
                "Science",
                "Which material is attracted by a magnet?",
                "Wood",
                "Glass",
                "Plastic",
                "Iron",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.honey,
                "Science",
                "What do bees collect from flowers?",
                "Water",
                "Nectar",
                "Seeds",
                "Leaves",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.solar_system,
                "Science",
                "How many planets are in the Solar System?",
                "7",
                "8",
                "9",
                "10",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.earth,
                "Science",
                "What covers most of the Earth’s surface?",
                "Land",
                "Ice",
                "Water",
                "Sand",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.water,
                "Science",
                "What is the boiling point of water?",
                "0°C",
                "50°C",
                "100°C",
                "150°C",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.earth,
                "Science",
                "What do we call the air around the Earth?",
                "Atmosphere",
                "Gravity",
                "Space",
                "Oxygen",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.plant,
                "Science",
                "Which part of the plant makes food?",
                "Root",
                "Stem",
                "Seed",
                "Leaf",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.biology,
                "Science",
                "What do we call the study of living things?",
                "Physics",
                "Chemistry",
                "Astronomy",
                "Biology",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.solar_system,
                "Science",
                "Which planet is the largest in the Solar System?",
                "Earth",
                "Mars",
                "Jupiter",
                "Venus",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.temp,
                "Science",
                "What do we use to measure temperature?",
                "Clock",
                "Thermometer",
                "Ruler",
                "Scale",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.earth,
                "Science",
                "What is the Earth’s natural satellite?",
                "Moon",
                "Sun",
                "Mars",
                "Star",
                0,
                -1
            )
        )

        ////////////////////////////////////////////////////////////////////////////////////////////

        list.add(
            QuestionData(
                R.drawable.mathc,
                "Football",
                "How many players are on one team on the field?",
                "9",
                "10",
                "11",
                "12",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.time,
                "Football",
                "How long is a standard football match?",
                "90 minutes",
                "60 minutes",
                "80 minutes",
                "70 minutes",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.world_cup,
                "Football",
                "Which national team won the FIFA World Cup in 2010?",
                "Germany",
                "Italy",
                "France",
                "Spain",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.champions_league,
                "Football",
                "Which club won the UEFA Champions League in 2015?",
                "Real Madrid CF",
                "FC Barcelona",
                "AC Milan",
                "Chelsea FC",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.dribling,
                "Football",
                "What skill means controlling the ball with feet?",
                "Shooting",
                "Passing",
                "Heading",
                "Dribbling",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.world_cup,
                "Football",
                "Which national team lost the FIFA World Cup final in 2018?",
                "Croatia",
                "France",
                "Argentina",
                "Italy",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.champions_league,
                "Football",
                "Which club won the first UEFA Champions League ever?",
                "AC Milan",
                "Real Madrid CF",
                "Liverpool FC",
                "FC Bayern München",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.premier_league,
                "Football",
                "Which club won the Premier League in 24/25 season?",
                "Arsenal FC",
                "Manchester United",
                "Manchester City",
                "Chelsea FC",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.hatrick,
                "Football",
                "What is it called when a player scores three goals in one match?",
                "Triple goal",
                "Hat-trick",
                "Three score",
                "Goal set",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.world_cup,
                "Football",
                "Which country hosted the 2022 FIFA World Cup?",
                "Russia",
                "Brazil",
                "Qatar",
                "Germany",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.referee,
                "Football",
                "How many referees are usually on the field?",
                "2",
                "1",
                "4",
                "3",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.offside,
                "Football",
                "What is offside?",
                "Illegal position",
                "Wrong throw",
                "Handball",
                "Red card",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.balon_dor,
                "Football",
                "Which player won the Ballon d'Or in 2018?",
                "L. Messi",
                "L. Modrić",
                "C. Ronaldo",
                "R. Lewandowski",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.balon_dor,
                "Football",
                "How many Ballon d'Or does Cristiano Ronaldo won?",
                "3",
                "4",
                "5",
                "6",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.balon_dor,
                "Football",
                "When did Lionel Messi won his first Ballon d'Or?",
                "2010",
                "2011",
                "2008",
                "2009",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.sign,
                "Football",
                "Which club did Neymar first sign with?",
                "Santos FC",
                "FC Barcelona",
                "Paris SG",
                "Al Hilal SFC",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.world_cup,
                "Football",
                "Which national team won the first FIFA World Cup ever?",
                "Argentina",
                "Spain",
                "Germany",
                "Uruguay",
                3,
                -1
            )
        )

        ////////////////////////////////////////////////////////////////////////////////////////////

        list.add(
            QuestionData(
                R.drawable.owl,
                "Movie",
                "In Harry Potter, what is the name of Harry’s owl?",
                "Crookshanks",
                "Hedwig",
                "Scabbers",
                "Errol",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.malfoy,
                "Movie",
                "Which house does Draco Malfoy belong to?",
                "Gryffindor",
                "Ravenclaw",
                "Hufflepuff",
                "Slytherin",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.titanic,
                "Movie",
                "In Titanic, what is the name of the main female character?",
                "Anna",
                "Emily",
                "Rose",
                "Kate",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.simba,
                "Movie",
                "What is the name of Simba’s father in The Lion King?",
                "Mufasa",
                "Scar",
                "Zazu",
                "Rafiki",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.po,
                "Movie",
                "In Kung Fu Panda, Po becomes the:",
                "Tiger Warrior",
                "Shadow Warrior",
                "Dragon Warrior",
                "Fire Warrior",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.vision,
                "Movie",
                "Which Infinity Stone does Vision have?",
                "Power",
                "Space",
                "Time",
                "Mind",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.elsa,
                "Movie",
                "In Frozen, Elsa’s powers are related to:",
                "Fire",
                "Ice",
                "Water",
                "Wind",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.iron_man,
                "Movie",
                "What is the name of Iron Man’s AI assistant?",
                "JARVIS",
                "EDITH",
                "FRIDAY",
                "ULTRON",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.infinity_war,
                "Movie",
                "Who is the villain in Avengers: Infinity War?",
                "Loki",
                "Ultron",
                "Thanos",
                "Red Skull",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.mcqueen,
                "Movie",
                "In Cars, what type of car is Lightning McQueen?",
                "Race car",
                "Truck",
                "Formula car",
                "Police car",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.black_pearl,
                "Movie",
                "In Pirates of the Caribbean, what is Jack Sparrow’s ship called?",
                "Flying Dutchman",
                "Black Pearl",
                "Queen Anne",
                "Silent Mary",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.no_way_home,
                "Movie",
                "Who is Spider-Man’s enemy in Spider-Man: No Way Home?",
                "Green Goblin",
                "Doctor Octopus",
                "Venom only",
                "Multiple villains",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.mann,
                "Movie",
                "In Ice Age, what animal is Manny?",
                "Elephant",
                "Mammoth",
                "Rhino",
                "Buffalo",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.coco,
                "Movie",
                "In Coco, what is the main theme of the movie?",
                "War",
                "Love",
                "Family memories",
                "Money",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.minions,
                "Movie",
                "In \"Despicable Me\", what do Minions love?",
                "Bananas",
                "Apples",
                "Oranges",
                "Grapes",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.inisde_out,
                "Movie",
                "Which cartoon is about emotions inside a girl’s mind?",
                "Luca",
                "Turning Red",
                "Soul",
                "Inside Out",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.downey,
                "Movie",
                "Who plays Iron Man in the Marvel movies?",
                "Chris Evans",
                "Chris Hemsworth",
                "Tom Holland",
                "Robert Downey Jr.",
                3,
                -1
            )
        )

        ////////////////////////////////////////////////////////////////////////////////////////////

        list.add(
            QuestionData(
                R.drawable.paris,
                "Capitals",
                "What is the capital of France?",
                "Lyon",
                "Marseille",
                "Paris",
                "Nice",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.tokyo,
                "Capitals",
                "What is the capital of Japan?",
                "Kyoto",
                "Osaka",
                "Hiroshima",
                "Tokyo",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.london,
                "Capitals",
                "What is the capital of the United Kingdom?",
                "Manchester",
                "London",
                "Liverpool",
                "Birmingham",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.berlin,
                "Capitals",
                "What is the capital of Germany?",
                "Berlin",
                "Munich",
                "Hamburg",
                "Frankfurt",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.rome,
                "Capitals",
                "What is the capital of Italy?",
                "Venice",
                "Milan",
                "Rome",
                "Naples",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.moscow,
                "Capitals",
                "What is the capital of Russia?",
                "Saint Petersburg",
                "Moscow",
                "Kazan",
                "Sochi",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.wall,
                "Capitals",
                "What is the capital of China?",
                "Shanghai",
                "Hong Kong",
                "Guangzhou",
                "Beijing",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.washington,
                "Capitals",
                "What is the capital of the USA?",
                "Washington D.C.",
                "New York",
                "Chicago",
                "Los Angeles",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.ottawa,
                "Capitals",
                "What is the capital of Canada?",
                "Toronto",
                "Vancouver",
                "Ottawa",
                "Montreal",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.madrid,
                "Capitals",
                "What is the capital of Spain?",
                "Barcelona",
                "Seville",
                "Madrid",
                "Valencia",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.nakara,
                "Capitals",
                "What is the capital of Turkey?",
                "Ankara",
                "Istanbul",
                "Izmir",
                "Bursa",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.seoul,
                "Capitals",
                "What is the capital of South Korea?",
                "Busan",
                "Seoul",
                "Daegu",
                "Incheon",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.canberra,
                "Capitals",
                "What is the capital of Australia?",
                "Sydney",
                "Melbourne",
                "Canberra",
                "Perth",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.brasilia,
                "Capitals",
                "What is the capital of Brazil?",
                "Rio de Janeiro",
                "Brasília",
                "São Paulo",
                "Salvador",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.cairo,
                "Capitals",
                "What is the capital of Egypt?",
                "Alexandria",
                "Luxor",
                "Giza",
                "Cairo",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.new_delhi,
                "Capitals",
                "What is the capital of India?",
                "New Delhi",
                "Mumbai",
                "Bangalore",
                "Chennai",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.buenos_aires,
                "Capitals",
                "What is the capital of Argentina?",
                "Córdoba",
                "Rosario",
                "Buenos Aires",
                "Mendoza",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.mexico_city,
                "Capitals",
                "What is the capital of Mexico?",
                "Cancun",
                "Guadalajara",
                "Monterrey",
                "Mexico City",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.kiew,
                "Capitals",
                "What is the capital of Ukraine?",
                "Kyiv",
                "Kharkiv",
                "Odesa",
                "Lviv",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.lisabon,
                "Capitals",
                "What is the capital of Portugal?",
                "Porto",
                "Lisbon",
                "Braga",
                "Faro",
                1,
                -1
            )
        )

        ////////////////////////////////////////////////////////////////////////////////////////////

        list.add(
            QuestionData(
                R.drawable.wahington,
                "History",
                "Who was the first President of the United States?",
                "A. Lincoln",
                "G. Washington",
                "T. Jefferson",
                "J. Adams",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.ww2,
                "History",
                "In which year did World War II end?",
                "1943",
                "1944",
                "1945",
                "1946",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.clumb,
                "History",
                "Who discovered America in 1492?",
                "Vasco da Gama",
                "F. Magellan",
                "Marco Polo",
                "Ch. Columbus",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.pyramid,
                "History",
                "Which ancient civilization built the pyramids?",
                "Egyptians",
                "Greeks",
                "1945",
                "Persians",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.amir_temur,
                "History",
                "Which empire was ruled by Amir Timur?",
                "Roman Empire",
                "Ottoman Empire",
                "Timurid Empire",
                "Mongol Empire",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.moonland,
                "History",
                "Who was the first man to walk on the Moon?",
                "Yuri Gagarin",
                "Neil Armstrong",
                "Buzz Aldrin",
                "Michael Collins",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.nazi,
                "History",
                "Who was the leader of Nazi Germany?",
                "Joseph Stalin",
                "Adolf Hitler",
                "Benito Mussolini",
                "Winston Churchill",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.titanic,
                "History",
                "What ship sank in 1912?",
                "Britannic",
                "Lusitania",
                "Queen Mary",
                "Titanic",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.gagarin,
                "History",
                "Who was the first man in space?",
                "Neil Armstrong",
                "John Glenn",
                "Yuri Gagarin",
                "Alan Shepard",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.colosseum,
                "History",
                "Which empire built the Colosseum?",
                "Roman",
                "Greek",
                "Byzantine",
                "Persian",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.ww1,
                "History",
                "What year did World War I begin?",
                "1912",
                "1913",
                "1915",
                "1914",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.cleopatra,
                "History",
                "Who was Cleopatra?",
                "Roman general",
                "Egyptian queen",
                "Greek philosopher",
                "Persian princess",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.silk_road,
                "History",
                "What was the Silk Road?",
                "A sea route",
                "A railway",
                "A trade route",
                "A wall",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.lincoln,
                "History",
                "Who was Abraham Lincoln?",
                "King of England",
                "US President",
                "Roman emperor",
                "French general",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.wall,
                "History",
                "Which ancient structure is in China?",
                "Great Wall",
                "Taj Mahal",
                "Colosseum",
                "Petra",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.caliph,
                "History",
                "Who was the first caliph of Islam?",
                "Umar ibn Khattab",
                "Ali ibn Abi Talib",
                "Usman ibn Affan",
                "Abu Bakr",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.asia,
                "History",
                "What empire ruled much of Central Asia in the 14th century?",
                "Ottoman",
                "Roman",
                "Timurid",
                "British",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.colonize,
                "History",
                "Which country colonized India?",
                "France",
                "Spain",
                "Portugal",
                "Britain",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.soviet,
                "History",
                "When did the Soviet Union collapse?",
                "1991",
                "1985",
                "1995",
                "1989",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.alexnder,
                "History",
                "Who was Alexander the Great?",
                "Roman emperor",
                "Macedonian king",
                "Persian shah",
                "Egyptian pharaoh",
                1,
                -1
            )
        )

        ///////////////////////////////////////////////////////////////////////////////////////////

        list.add(
            QuestionData(
                R.drawable.minecraft,
                "Games",
                "In which game do players build and survive in a block world?",
                "Roblox",
                "Fortnite",
                "Minecraft",
                "Terraria",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.battle_royal,
                "Games",
                "Which game features a battle royale mode?",
                "FIFA",
                "Fortnite",
                "Among Us",
                "Subway Surfers",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.mojang,
                "Games",
                "Which company obtains Minecraft?",
                "Mojang",
                "EA",
                "Ubisoft",
                "Valve",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.e_football,
                "Games",
                "Which game is about football?",
                "NBA",
                "Call of Duty",
                "GTA",
                "PES / eFootball",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.among_us,
                "Games",
                "In Among Us, who is the enemy?",
                "Zombie",
                "Alien",
                "Impostor",
                "Monster",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.subway_surfers,
                "Games",
                "What is the main goal in Subway Surfers?",
                "Fight enemies",
                "Build cities",
                "Score goals",
                "Run endlessly",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.clash,
                "Games",
                "What type of game is Clash of Clans?",
                "Racing",
                "Strategy",
                "Sports",
                "Puzzle",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.mario,
                "Games",
                "Who is the main villain in Mario games?",
                "Bowser",
                "Luigi",
                "Toad",
                "Yoshi",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.vice_city,
                "Games",
                "Which game series includes Vice City?",
                "Mafia",
                "Need for Speed",
                "GTA",
                "Saints Row",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.fifa,
                "Games",
                "What company makes the FIFA game series?",
                "Konami",
                "EA Sports",
                "Ubisoft",
                "2K Games",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.call_of_suty,
                "Games",
                "What type of game is Call of Duty?",
                "Strategy",
                "Puzzle",
                "Sports",
                "Shooter",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.ps,
                "Games",
                "What device is used to play console games?",
                "Controller",
                "Keyboard",
                "Mouse",
                "Camera",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.brawl_star,
                "Games",
                "Which game has legendary characters called brawlers?",
                "Clash of Clans",
                "Brawl Stars",
                "Fortnite",
                "Roblox",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.gta,
                "Games",
                "What genre is GTA?",
                "Racing only",
                "Simulation",
                "Action-adventure",
                "Puzzle",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.ps,
                "Games",
                "Which company created PlayStation?",
                "Microsoft",
                "Sega",
                "Nintendo",
                "Sony",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.gta1,
                "Games",
                "Which game is about open-world crime?",
                "The Sims",
                "Minecraft",
                "GTA",
                "Fortnite",
                2,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.fruit_ninja,
                "Games",
                "Which mobile game involves slicing fruits?",
                "Fruit Ninja",
                "Temple Run",
                "Cut the Rope",
                "Candy Crush",
                0,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.minecraft,
                "Games",
                "Which game is famous for creepers and endermen?",
                "Roblox",
                "Terraria",
                "Fortnite",
                "Minecraft",
                3,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.angry_birds,
                "Games",
                "What is the main goal in Angry Birds?",
                "Build towers",
                "Shoot pigs",
                "Collect coins",
                "Race cars",
                1,
                -1
            )
        )
        list.add(
            QuestionData(
                R.drawable.traffic_rider,
                "Games",
                "What increases your score in Traffic Rider?",
                "Jumping obstacles",
                "Overtaking cars",
                "Collecting coins",
                "Parking",
                1,
                -1
            )
        )

    }

    fun getAllQuestions(): List<QuestionData> {
        return list
    }

    fun getMathQuestions(count: Int): List<QuestionData> {
        val resultList = mutableListOf<QuestionData>()
        for (i in list.indices) {
            if (list[i].category == "Mathematics") {
                resultList.add(list[i])
            }
        }
        resultList.shuffle()
        val listSize = resultList.size
        for (i in count..<listSize) {
            resultList.removeAt(0)
        }
        return resultList
    }

    fun getEnglishQuestions(count: Int): List<QuestionData> {
        val resultList = mutableListOf<QuestionData>()
        for (i in list.indices) {
            if (list[i].category == "English") {
                resultList.add(list[i])
            }
        }
        resultList.shuffle()
        val listSize = resultList.size
        for (i in count..<listSize) {
            resultList.removeAt(0)
        }
        return resultList
    }

    fun getScienceQuestions(count: Int): List<QuestionData> {
        val resultList = mutableListOf<QuestionData>()
        for (i in list.indices) {
            if (list[i].category == "Science") {
                resultList.add(list[i])
            }
        }
        resultList.shuffle()
        val listSize = resultList.size
        for (i in count..<listSize) {
            resultList.removeAt(0)
        }
        return resultList
    }

    fun getFootballQuestions(count: Int): List<QuestionData> {
        val resultList = mutableListOf<QuestionData>()
        for (i in list.indices) {
            if (list[i].category == "Football") {
                resultList.add(list[i])
            }
        }
        resultList.shuffle()
        val listSize = resultList.size
        for (i in count..<listSize) {
            resultList.removeAt(0)
        }
        return resultList
    }

    fun getMovieQuestions(count: Int): List<QuestionData> {
        val resultList = mutableListOf<QuestionData>()
        for (i in list.indices) {
            if (list[i].category == "Movie") {
                resultList.add(list[i])
            }
        }
        resultList.shuffle()
        val listSize = resultList.size
        for (i in count..<listSize) {
            resultList.removeAt(0)
        }
        return resultList
    }

    fun getCapitalsQuestions(count: Int): List<QuestionData> {
        val resultList = mutableListOf<QuestionData>()
        for (i in list.indices) {
            if (list[i].category == "Capitals") {
                resultList.add(list[i])
            }
        }
        resultList.shuffle()
        val listSize = resultList.size
        for (i in count..<listSize) {
            resultList.removeAt(0)
        }
        return resultList
    }

    fun getHistoryQuestions(count: Int): List<QuestionData> {
        val resultList = mutableListOf<QuestionData>()
        for (i in list.indices) {
            if (list[i].category == "History") {
                resultList.add(list[i])
            }
        }
        resultList.shuffle()
        val listSize = resultList.size
        for (i in count..<listSize) {
            resultList.removeAt(0)
        }
        return resultList
    }

    fun getGamesQuestions(count: Int): List<QuestionData> {
        val resultList = mutableListOf<QuestionData>()
        for (i in list.indices) {
            if (list[i].category == "Games") {
                resultList.add(list[i])
            }
        }
        resultList.shuffle()
        val listSize = resultList.size
        for (i in count..<listSize) {
            resultList.removeAt(0)
        }
        return resultList
    }
}