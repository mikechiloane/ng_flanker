package com.faboda.ng_flanker.question;

public class QuestionUtil {

    private static String[] questions = {
            "What are your hobbies?",
            "What do you do for work?",
            "Do you have any pets?",
            "What's your favorite movie?",
            "What's your favorite book?",
            "What's your favorite type of music?",
            "What's your favorite food?",
            "Do you play any sports?",
            "What's the most important quality in a friend?",
            "How do you maintain meaningful relationships?",
            "What's your idea of a perfect date?",
            "How do you handle conflict in relationships?",
            "What's the best way to meet new people?",
            "What role does trust play in your relationships?",
            "How do you show appreciation to loved ones?",
            "What's your favorite way to spend time with family?",
            "How do you balance personal and professional relationships?",
            "What's the most memorable moment with a friend?",
            "How do you handle long-distance relationships?",
            "What's a relationship mistake you've learned from?",
            "What's your ideal family gathering?",
            "How do you keep in touch with old friends?",
            "What's the key to a successful relationship?",
            "What's your dream vacation destination?",
            "What's your favorite way to relax?",
            "What's your proudest accomplishment?",
            "What's your favorite childhood memory?",
            "Do you have any siblings?",
            "What's your favorite thing about yourself?",
            "What's something you're passionate about?",
            "What's your favorite season?",
            "What's the last book you read?",
            "What's the last movie you watched?",
            "What's your favorite TV show?",
            "How do you feel about new technology?",
            "What's the role of technology in your daily life?",
            "How do you stay updated with technological trends?",
            "What's your favorite piece of technology?",
            "How do you balance technology use with personal connections?",
            "What do you think about AI and automation?",
            "What's your favorite tech gadget?",
            "What's the role of social media in your life?",
            "How do you ensure privacy and security online?",
            "What's your favorite tech-related hobby?",
            "How do you feel about remote work and virtual collaboration?",
            "What's the impact of technology on society?",
            "What's your favorite type of cuisine?",
            "What's your favorite sports team?",
            "Do you have any hidden talents?",
            "What's the most adventurous thing you've ever done?",
            "What's your favorite way to spend a weekend?",
            "What's your favorite board game?",
            "Do you prefer coffee or tea?",
            "What's your favorite quote?",
            "What's your favorite holiday?",
            "What's your favorite dessert?",
            "What's your biggest fear?",
            "What's your dream job?",
            "What's your favorite color?",
            "What's your favorite animal?",
            "Do you prefer mountains or beaches?",
            "What's your favorite outdoor activity?",
            "What's your favorite indoor activity?",
            "What's your favorite type of cuisine?",
            "What's your favorite type of vehicle?",
            "What's your favorite type of weather?",
            "What's your favorite way to exercise?",
            "What's your favorite type of art?",
            "What's your favorite type of literature?",
            "What's your favorite genre of music?",
            "What's your favorite instrument?",
            "What's your favorite place you've visited?",
            "What's your favorite thing to cook?",
            "What's your favorite thing to bake?",
            "What's your favorite childhood TV show?",
            "What's your favorite childhood game?",
            "What's your favorite thing about your job?",
            "What motivates you in your career?",
            "What's your dream job, and why?",
            "How do you manage work-life balance?",
            "What's the biggest challenge in your career?",
            "How do you handle workplace stress?",
            "What's the most important skill in your profession?",
            "How do you stay productive at work?",
            "What's the best career advice you've received?",
            "How do you deal with difficult coworkers?",
            "What's your approach to professional development?",
            "How do you set career goals?",
            "What's your favorite hobby?",
            "What's your favorite book and why?",
            "What's your favorite movie genre?",
            "What's your favorite travel destination?",
            "What's your favorite childhood memory?",
            "What's the most adventurous thing you've ever done?",
            "What's your favorite outdoor activity?",
            "What's your favorite indoor activity?",
            "What's your favorite way to spend a weekend?",
            "What's your favorite way to relax?",
            "What's the best vacation you've ever had?",
            "What's your favorite type of music?",
            "What's your favorite dessert?",
            "What's your favorite board game?",
            "What's your favorite quote?",
            "What's the most rewarding aspect of your job?",
            "How do you stay focused on long-term career objectives?",
            "What's your favorite way to celebrate work achievements?",
            "How do you prepare for a job interview?",
            "What's your favorite thing about your hometown?",
            "What's your favorite thing about your current city?",
            "What's your favorite thing about yourself?",
            "What's your favorite memory with your friends?",
            "What's your favorite memory with your family?",
            "What's your favorite memory from school?",
            "What's your favorite memory from college?",
            "What's your favorite memory from a vacation?",
            "What's your favorite thing to do in your free time?",
            "What's your favorite thing to do on a rainy day?",
            "What's your favorite thing to do on a sunny day?",
            "What's your favorite thing to do on a snowy day?",
            "What's your favorite thing to do on a hot day?",
            "What's your favorite thing to do on a cold day?",
            "What's your favorite thing to do in the morning?",
            "What's your favorite thing to do at night?",
            "What's your favorite thing to do with friends?",
            "What's your favorite thing to do with family?",
            "What's your favorite thing to do alone?",
            "What's your favorite thing to do with your significant other?",
            "What's your favorite thing to do on a date?",
            "What's your favorite thing to do on a weekend?",
            "What's your favorite thing to do on a weeknight?",
            "What's your favorite thing to do on a holiday?",
            "What's your favorite thing to do on a special occasion?",
            "What's your favorite thing to do when you're stressed?",
            "What's your favorite thing to do when you're sad?",
            "What's your favorite thing to do when you're happy?",
            "What's your favorite thing to do when you're bored?",
            "What's your favorite thing to do when you're excited?",
            "What's your favorite thing to do when you're tired?",
            "What's your favorite thing to do when you're feeling creative?",
            "What's your favorite thing to do when you're feeling lazy?",
            "What's your favorite thing to do when you're feeling motivated?",
            "What's your favorite thing to do when you're feeling adventurous?",
            "What's your favorite thing to do when you're feeling spontaneous?",
            "What's your favorite thing to do when you're feeling romantic?",
            "What's your favorite thing to do when you're feeling nostalgic?",
            "What's your favorite thing to do when you're feeling grateful?",
            "What's your favorite thing to do when you're feeling curious?",
            "What's your favorite thing to do when you're feeling confident?",
            "What's your favorite thing to do when you're feeling insecure?",
            "What's your favorite thing to do when you're feeling anxious?",
            "What's your favorite thing to do when you're feeling hopeful?",
            "What's your favorite thing to do when you're feeling inspired?",
            "What's your favorite thing to do when you're feeling bored?",
            "What's your favorite thing to do when you're feeling motivated?",
            "What's your favorite thing to do when you're feeling restless?",
            "What's your favorite thing to do when you're feeling lonely?",
            "What's your favorite thing to do when you're feeling excited?",
            "What's your favorite thing to do when you're feeling tired?",
            "What's your favorite thing to do when you're feeling happy?",
            "What's your favorite thing to do when you're feeling sad?",
            "What's your favorite thing to do when you're feeling stressed?",
            "What's your favorite thing to do when you're feeling overwhelmed?",
            "What's your favorite thing to do when you're feeling angry?",
            "What's your favorite thing to do when you're feeling hurt?",
            "What's your favorite thing to do when you're feeling scared?",
            "What's your favorite thing to do when you're feeling uncertain?",
            "What's your favorite thing to do when you're feeling hopeful?",
            "What personal goals do you want to achieve this year?",
            "How do you handle stress in your daily life?",
            "What's the best piece of advice you've ever received?",
            "What does success mean to you?",
            "What new skills are you interested in learning?",
            "What's a habit you'd like to change?",
            "How do you stay motivated during challenging times?",
            "What's your biggest personal accomplishment?",
            "What inspires you to keep going?",
            "How do you define happiness?",
            "What do you do to relax and unwind?",
            "How do you measure your progress toward your goals?",
            "What's the kind of legacy you'd like to leave behind?",
            "What's something new you've tried recently?",
            "What personal values do you hold most dear?",
            "What's the most important lesson you've learned in life?",
            "What's your favorite thing to do when you're feeling grateful?",
            "What's your favorite thing to do when you're feeling nostalgic?",
            "What's your favorite thing to do when you're feeling curious?",
            "What's your favorite thing to do when you're feeling confident?",
            "What's your favorite thing to do when you're feeling insecure?",
            "What's your favorite thing to do when you're feeling anxious?",
            "What's your favorite thing to do when you're feeling restless?",
            "What's your favorite thing to do when you're feeling lonely?",
            "What's your favorite thing to do when you're feeling excited?",
            "What's your favorite thing to do when you're feeling tired?",
            "What's your favorite thing to do when you're feeling happy?",
            "What's your favorite thing to do when you're feeling sad?",
            "What's your favorite thing to do when you're feeling stressed?",
            "What's your favorite thing to do when you're feeling overwhelmed?",
            "What's your favorite thing to do when you're feeling angry?",
            "What's your favorite thing to do when you're feeling hurt?",
            "What's your favorite thing to do when you're feeling scared?",
            "What's your favorite thing to do when you're feeling uncertain?",
            "What's your favorite thing to do when you're feeling hopeful?",
            "What's your favorite thing to do when you're feeling grateful?",
            "What's your favorite thing to do when you're feeling nostalgic?",
            "What's your philosophy of life?",
            "How do you approach ethical dilemmas?",
            "What do you think is the meaning of life?",
            "How do you define a good person?",
            "What's your stance on societal issues?",
            "What role does religion or spirituality play in your life?",
            "How do you approach questions about morality?",
            "What's the most important lesson you've learned from philosophy?",
            "How do you deal with uncertainty in life?",
            "What's the biggest ethical challenge you've faced?",
            "What does it mean to be compassionate?",
            "How do you handle disagreements on ethical issues?",
            "What's your perspective on free will and determinism?",
            "What's the role of forgiveness in your life?",
            "What's your favorite thing to do when you're feeling curious?",
            "What's your favorite thing to do when you're feeling confident?",
            "What's your favorite thing to do when you're feeling insecure?",
            "What's your favorite thing to do when you're feeling anxious?",
            "What's your favorite thing to do when you're feeling restless?",
            "What's your favorite thing to do when you're feeling lonely?",
            "What's your favorite thing to do when you're feeling excited?",
            "What's your favorite thing to do when you're feeling tired?",
            "What's your favorite thing to do when you're feeling happy?",
            "What's your favorite thing to do when you're feeling sad?",
            "What's your favorite thing to do when you're feeling stressed?",
            "What's your favorite thing to do when you're feeling overwhelmed?",
            "What's your favorite thing to do when you're feeling angry?",
            "What's your favorite thing to do when you're feeling hurt?",
            "What's your favorite thing to do when you're feeling scared?",
            "What's your favorite thing to do when you're feeling uncertain?",
            "What personal goals do you want to achieve this year?",
            "How do you handle stress in your daily life?",
            "What's the best piece of advice you've ever received?",
            "What does success mean to you?",
            "What new skills are you interested in learning?",
            "What's a habit you'd like to change?",
            "How do you stay motivated during challenging times?",
            "What's your biggest personal accomplishment?",
            "What inspires you to keep going?",
            "How do you define happiness?",
            "What's your approach to physical fitness?",
            "What are your favorite healthy meals?",
            "How do you stay motivated to exercise?",
            "What's your approach to mental health?",
            "How do you manage stress and anxiety?",
            "What's your favorite way to stay active?",
            "How do you maintain a healthy work-life balance?",
            "What's your favorite way to relax and unwind?",
            "What's your favorite form of exercise?",
            "How do you maintain a positive mindset?",
            "What's the role of nutrition in your life?",
            "What's the most important aspect of health for you?",
    };

    public static String getRandomQuestion() {
        int randomIndex = (int) (Math.random() * questions.length);
        return questions[randomIndex];
    }
}
