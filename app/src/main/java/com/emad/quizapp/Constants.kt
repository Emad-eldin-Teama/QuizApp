package com.emad.quizapp
/* 14
        val quenumber = Question(
            14, " question here ",
            R.drawable.logoreduced,
            "وحدوية", "كونفدرالية",
            "-لامركزية", "فيدرالية", 4
        )

        questionList.add(quenumber)
        */
object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = " total_question"
    const val CORRECT_ANSWERS:String ="correct_answers"


    fun getQuestions():ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val que1 = Question(1,"تتأثر الأنشطة البشرية التى يمارسها السكان بدرجة كبيرة بطبيعة",
            R.drawable.logoreduced ,
            "الموقع بالنسبة للدول المجاورة",
            "المواقع المركزيةوالهامشية" ,
            "الموقع بالنسبة لليابس والماء",
            "المواقع الاستراتيجية",
            3
        )
        questionList.add(que1)
        // 2
        val que2 = Question(
            2, "الكيان الذى تكون فيه المسئولية مشتركة بين الفرد والحكومة",
            R.drawable.logoreduced,
            "الأمة", "الدولة",
            "القومية", "التكتل", 2
        )

        questionList.add(que2)

        // 3
        val que3 = Question(
            3, "فى الدولة الفيدرالية سلطة الحكومة المحلية ",
            R.drawable.logoreduced,
            "مستقلة كلياً  ", "مندمجة مع السلطة المركزية",
            "موجهه  ", "لها دستور خاص بها ", 2
        )

        questionList.add(que3)

        // 4
        val que4 = Question(
            4, "دولة تمتد أراضيها فى عدد خطوط طول أكبر بكثير من دوائر العرض?",
            R.drawable.logoreduced,
            "مصر", "تركيا",
            "شيلى", "بلجيكا", 2
        )

        questionList.add(que4)

        // 5
        val que5 = Question(
            5, "يتمثل الفارق بين دولة السودان ودول غرب أوروبا فى",
            R.drawable.logoreduced,
            "التمتع بمزايا الاستقرار السكانى", " التمتع بمزايا التجانس العرقى",
            "التمتع  بمزايا الاستقرار السياسى", "التمتع بمزايا الدول الداخلية", 2
        )

        questionList.add(que5)

        // 6
        val que6 = Question(
            6, " المغرب أكثر تأثراً  بالمؤثرات الحضارية من دولة مالى رغم \n" +
                    "تجاورهما بسبب",
            R.drawable.logoreduced,
            "الموقع الفلكى", "الموقع الداخلى",
            "كثرة الدول المجاورة", "الموقع البحرى", 4
        )

        questionList.add(que6)

        // 7
        val que7 = Question(
            7, "-تشترك الجغرافيا السياسية والجيوبولتيك فى فكرة واحدة وهى فكرة",
            R.drawable.logoreduced,
            "التوسع الاستعمارى", "الوحدة والانسجام",
            " موضوع الدراسة (الدوله)", "الصراع بين الدول", 3
        )

        questionList.add(que7)

        // 8
        val que8 = Question(
            8, "إذا كانت السلطة المركزية لها صلاحيات محدودة فان هذا يشير إلى",
            R.drawable.logoreduced,
            "دولة مركزية", "دولة فيدرالية",
            "اتحاد كونفدرالى", "دولة وحدوية", 3
        )

        questionList.add(que8)

        // 9
        val que9 = Question(
            9, "-يتحقق نجاح الدولة فى قيام التكامل بين مقوماتها بناء على أفكار",
            R.drawable.logoreduced,
            "أرسطو", "ابن خلدون",
            "كيلين", "راتزل", 1
        )

        questionList.add(que9)

        // 10
        val que10 = Question(
            10, "العامل الأساسى فى إعادة رسم حدود أوروبا خلال القرن العشرين",
            R.drawable.logoreduced,
            "التوسع الاستعمارى", "-حروب أهلية",
            "الصراع العالمى", "الأحلاف العسكرية", 1
        )

        questionList.add(que10)
        // 11
        val que11 = Question(
            11, "من التجمعات الاقليمية على خريطة العالم السياسية",
            R.drawable.logoreduced,
            "منظمة الأمم المتحدة  ", "مجلس التعاون الخليجى",
            "مجلس الأمن", "محكمة العدل الدولية", 2
        )

        questionList.add(que11)
        // 12
        val que12 = Question(
            12, " دراسة الأثر الناتج عن قلة انتاج الأراضى الزراعية ضمن مجالات ",
            R.drawable.logoreduced,
            "العولمة الاجتماعية ", "النظام العالمى الجديد",
            "التحليل السياسى للقوة", "المشكلات السياسية", 2
        )

        questionList.add(que12)
        // 11
        val que13 = Question(
            13, "-تفتقد الدولة التى امامك(فرنسا) إلى ",
            R.drawable.qu13,
            "وحدة الخصائص الاثنوغرافية", "الاستقلال الذاتى للادارة المحلية",
            "انتشارها على خريطة العالم السياسية", " وجود مكان بها تقدم منه الخدمات الحكومية لجميع المواطنين", 2
        )

        questionList.add(que13)
        // 14
        val que14 = Question(
            14, " الدولة التى تفصل بين اقاليمها حدود إدارية فقط تسمى ",
            R.drawable.logoreduced,
            "وحدوية", "كونفدرالية",
            "-لامركزية", "فيدرالية", 4
        )

        questionList.add(que14)
        //15
        val que15 = Question(
            15, " التحول بالولاء من المجتمعات الصغيرة المتعددة إلى الكبير الواحد يندرج تحت مسمى ",
            R.drawable.logoreduced,
            "الأمة", "الدولة",
            "-القومية", "التكتل", 1
        )

        questionList.add(que15)
        //16

        val que16 = Question(
            16, " فشلت بلجيكا فى حماية أراضيها أثناء الحرب العالمية الثانية بسبب",
            R.drawable.logoreduced,
            "موقعها الجغرافى", "-موقعها الفلكى",
            "طابعها الجبلى", "صعوبة الدفاع بالعمق", 4
        )

        questionList.add(que16)
        //17

        val que17 = Question(
            17, "  يعد الاتحاد الكونفدرالى من أقل أنواع الدول انتشارا وأكثرهاهشاشة بسبب ",

            R.drawable.logoreduced,
            "حق المطالبة بالانفصال", "وجود سلطة مركزية مشتركة",
            "حق الشعب فى المشاركة بالشئون المركزية", " وجود عملة موحدة له ", 1
        )

        questionList.add(que17)
        //18

        val que18 = Question(
            18, " -يرتبط تفوق مصر على تونس فى المواقع البحرية ب ",

            R.drawable.logoreduced,
            "الظهير الساحلى", "طول خط الساحل",
            "أهمية المسطح المائى", " التمتع بالثروات البحرية ", 2
        )

        questionList.add(que18)
        //19

        val que19 = Question(
            19, " العلاقة بين طول حدود الدولة ومساحتها فى الدولة منتظمة الشكل ",

            R.drawable.logoreduced,
            "طردية", "عكسية",
            "تبادلية", " تكاملية ", 1
        )

        questionList.add(que19)
        //20

        val que20 = Question(
            20, " قوة الدولة لاتقاس بالكم2, فيؤخذ فى الاعتبار عوامل طبيعية هى ",

            R.drawable.logoreduced,
            " التنوع فى الموارد الباطنية", "قدرة السكان التكنولوجية",
            "النظم الاقتصادية والسياسية", " عدد السكان وتوزيعهم ", 1
        )

        questionList.add(que20)
        //21

        val que21 = Question(
            21, " -تعتبر اليابان دولة مجزاة جغرافياً وموحدة",

            R.drawable.logoreduced,
            " تاريخياً", "سياسياً",
            "اجتماعياً", " دينياً ", 2
        )

        questionList.add(que21)
        //22
        val que22 = Question(
            22, " تقنية الحصول على بيانات خاصة بقناة السويس دون اتصال مباشر",

            R.drawable.logoreduced,
            " نظم المعلومات الجغرافية", "تكنولوجيا المعلومات",
            "الاستشعار من بعد  ", " الاتصالات الحديثة ", 3
        )

        questionList.add(que22)
        //23
        val que23 = Question(
            23, " تتم عملية صنع القرار السياسى فى دولة سويسرا بشكل",

            R.drawable.logoreduced,
            " محلى", "مركزى",
            "فيدرالى", " كونفدرالى ", 3
        )

        questionList.add(que23)
        //24
        val que24 = Question(
            24, " يتم اختيار موقع العاصمة فى أكثر اقاليم الدولة أهمية اقتصادية ينطبق ذلك على",

            R.drawable.logoreduced,
            " أنقرة", "القاهرة",
            "طوكيو", " موسكو ", 3
        )

        questionList.add(que24)
        //25
        val que25 = Question(
            25, " من السلبيات التى تواجه الدول البحرية المجزاة",

            R.drawable.logoreduced,
            " ظهور النزعات الانفصالية",
            "صعوبة تحديد مياهها الاقليمية", " طول الحدود السياسية ","غياب السلطة", 2
        )

        questionList.add(que25)
        //26

        val que26 = Question(
            26, " تتم عملية صنع القرار السياسى فى دولة سويسرا بشكل",

            R.drawable.logoreduced,
            " محلى", "مركزى",
            "فيدرالى", " كونفدرالى ", 3
        )

        questionList.add(que26)
        //27
        val que27 = Question(
            27, " يعاكس المساحة الكبيرة للدولة",

            R.drawable.logoreduced,
            " تشجيع نمو النظام الاقتصادى", "إيجاد خطوط اتصال كثيرة وسريعة",
            "مستقبلية الحصول على موارد زراعية", " الاشراف المباشر لسيادة الدولة على كل أراضيها ", 4
        )

        questionList.add(que27)
        //28

        val que28 = Question(
            28, " أى من الدول الآتية تتميز بقدرتها على رسم خطط تنموية مستقبلية",

            R.drawable.logoreduced,
            " الدول عملاقة المساحة", "الدول متوسطة المساحة",
            "الدول صغيرة المساحة", " *كل ماسبق ", 3
        )

        questionList.add(que28)
        //29
        val que29 = Question(
            29, " تعيش ...... حالة من العلاقات الودية مع جيرانها على طول حدودها",

            R.drawable.logoreduced,
            " ألمانيا", "بلجيكا",
            "إيطاليا", " هولندا ", 2
        )

        questionList.add(que29)
        //30
        val que30 = Question(
            30, "العالم الذى تناول تأثير العلاقة بين الجوانب الاقتصادية والجوانب البشرية على الدولة",

            R.drawable.logoreduced,
            " أرسطو", "ابن خلدون",
            "كيلين", " راتزل ", 1
        )

        questionList.add(que30)
        //31
        val que31 = Question(
            31, "دولة تمتد أراضيها فى عدد دوائرعرض أكبر بكثير من خطوط الطول",

            R.drawable.logoreduced,
            " منغوليا", "تركيا",
            "شيلى", " فرنسا ", 3
        )

        questionList.add(que31)
        //32
        val que32 = Question(
            32, "يتمثل القاسم المشترك بين دولتى المغرب ونيوزيلاندا فى",

            R.drawable.logoreduced,
            " التمتع بمزايا المواقع الهامشيه", " *التمتع بمزايا المواقع الاستراتيجية",
            "التمتع بمزايا المواقع المركزية", "  التمتع بمزايا المواقع البحرية ", 4
        )

        questionList.add(que32)
        //33
        val que33 = Question(
            33, "الدولة التى تفصل بين أقاليمها حدود سياسية تسمى",

            R.drawable.logoreduced,
            " وحدوية", "فيدرالية",
            "مركزية", " لامركزية ", 4
        )

        questionList.add(que33)
        //34
        val que34 = Question(
            34, "إذا كانت الحدود تقع على مسافة متساوية من مركز الدولة فإنه يساعد على " ,


            R.drawable.logoreduced,
            "قلة النزاعات على الحدود", "حسن عمليات الادارة الداخلية",
            "*زيادة الاحتكاك والتوترات", " السيطرة على أنحاء الدولة ", 4
        )

        questionList.add(que34)
        //35
        val que35 = Question(
            35, "تتم عملية صنع القرار السياسى فى دولة الصين من خلال",

            R.drawable.logoreduced,
            " *السلطات المحلية", "الحكومة المركزية",
            "الحكومة الفيدرالية", " الحكومة الكونفدرالية ", 2
        )

        questionList.add(que35)
        //36
        val que36 = Question(
            36, "تعكس العادات والتقاليد والقيم الروحية والتاريخية للدولة أحد عوامل اختيار العاصمة مثل",

            R.drawable.logoreduced,
            " أبوجا", "-كيوتو الداخلية",
            "باريس", " استانبول ", 3
        )

        questionList.add(que36)
        //37
        val que37 = Question(
            37, "من العوامل الديموغرافية المحددة لاهمية مساحة الدولة",

            R.drawable.logoreduced,
            " سهولة الاتصال", "حجم الموارد الاقتصادية",
            "النظم السياسية السائدة", " التركيب العمرى للسكان ", 4
        )

        questionList.add(que37)
        //38
        val que38 = Question(
            38, "الفارق بين دولة يزيد التوتر على حدودها ودولة تعيش فى ود مع جيرانها على طول حدودها يرجع إلى",

            R.drawable.logoreduced,
            " التباين المورفولوجى ","التماسك الديموغرافى", "التماسك الاقتصادى",
            "التباين التنظيمى",  1
        )

        questionList.add(que38)
        //39
        val que39 = Question(
            39, "-تختلف أهمية نهر النيل عن أهمية نهر الدانوب للنمسا بسبب موقع مصر " ,


            R.drawable.logoreduced,
            " المركزى ","البحرى", "الفلكى",
            "الهامشى",  2
        )

        questionList.add(que39)
        //40
        val que40 = Question(
            40  , "لكى تتصل أفريقيا الوسطى بالعالم الخارجى لابد أن تتعاون مع دولة " ,


            R.drawable.logoreduced,
            " نيجيريا ","تشاد", "الكاميرون",
            "جنوب السودان",  3
        )
        questionList.add(que40)
        //41
        val que41 = Question(
            41  , "-يمكن أن تعتمد اوغندا فى اتصالها الخارجى على دولتى" ,


            R.drawable.logoreduced,
            " كينيا وتنزانيا ","كينيا والصومال", "تنزانيا والكنغو",
            "أثيوبيا وجنوب السودان",  1
        )
        questionList.add(que41)
        //42
        val que42 = Question(
            42  , "دولة.....................حبيسة رغم أنها تطل على مسطح مائى" ,


            R.drawable.logoreduced,
            " الكنغو ","أوغندا", "جنوب السودان",
            "ليسوتو",  2
        )
        questionList.add(que42)
        //43
        val que43 = Question(
            43  , "من الأنسب جغرافيا أن تتصل دولة جنوب السودان بالعالم الخارجى عن طريق" ,


            R.drawable.logoreduced,
            " نهرالنيل ودولة السودان  ","نهر الكنغو ودولة أفريقيا الوسطى", "بحيرة فيكتوريا ودولة أوغندا",
            "*دولة أثيوبيا والمحيط الهندى",  1
        )
        questionList.add(que43)
        //44
        val que44 = Question(
            44  , "-يمكن تصنيف ليسوتو على أنها دولة" ,


            R.drawable.logoreduced,
            " محتواه وشريطية ","-مندمجة وحبيسة", "حبيسة ومركزية",
            "بحرية ومندمجة",  1
        )
        questionList.add(que44)
        //45
        val que45 = Question(
            45  , "-أكثر دول القارة الآتية احتكاكاً مع دول الشرق الأقصى" ,
            R.drawable.logoreduced,
            " موريتانيا ","تونس", "أنجولا",
            "الصومال",  4
        )
        questionList.add(que45)
        //46
        val que46 = Question(
            46  , "أهم مايميز الأمة عن الدولة عنصر" ,
            R.drawable.logoreduced,
            " الشخصية القانونية "," سلطة حاكمة", "-الفارق الزمنى",
            "وحدة قانونية دائمة",  4
        )
        questionList.add(que46)
        //47
        val que47 = Question(
            47  , "تزداد فاعلية الولايات المتحدة فى مواجهة نتائج الكوارث الطبيعية بسبب" ,
            R.drawable.logoreduced,
            "تنوع المناخ "," تنوع التضاريس", "المساحة الكبيرة",
            "كثرة السكان",  3
        )
        questionList.add(que47)
        //48
        val que48 = Question(
            48  , "تراجعت حيادية وموضوعية الجغرافيا السياسية مع ظهور أفكار" ,
            R.drawable.logoreduced,
            "أرسطو "," ابن خلدون", "راتزل",
            "كيلين",  4
        )
        questionList.add(que48)
        // 49
        val que49 = Question(
            49  , "-تتحكم  دولتا عمان وايران فى مضيق هرمز وهذا يعنى" ,
            R.drawable.logoreduced,
            "أهمية موقع مضيق هرمز "," أن عمان دولة برية مجزاة", "كبر مساحة إيران",
            "صغر مساحة عمان",  2
        )
        questionList.add(que49)
        //50
        val que50 = Question(
            50  , "عندما قررت اليابان نقل عاصمتها فانها فضلت الجانب الاقتصادى على الجانب "
                    ,
            R.drawable.logoreduced,
            "السياسى "," العسكرى", "الحضارى",
            "",  4
        )
        questionList.add(que50)



        return questionList

    }
}