package com.example.sd6501;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MostPopular extends Fragment {

    public MostPopular() {
        // Required empty public constructor
    }

   String[] mangaTitles = { "Berserk", "JoJo no Kimyou na Bouken Part 7: Steel Ball Run", "One Piece", "Vagabond" ,
                          "Monster", "Fullmetal Alchemist", "Oyasumi Punpun", "Grand Blue", "Slam Dunk", "Kingdom",
                            "Monogatari Series: First Season", "20th Century Boys", "Kaguya-sama wa Kokurasetai: Tensai-tachi no Renai Zunousen",
                           "Vinland Saga", "Ashita no Joe", "Haikyuu!!", "Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e: 2-nensei-hen", "Monogatari Series: Second Season",
                            "GTO", "3-gatsu no Lion"};

    int[] mangaImages = { R.drawable.berserkold, R.drawable.jojo, R.drawable.onepiece, R.drawable.vagabond, R.drawable.monster, R.drawable.fullmetalalchemist,
            R.drawable.oyasumipunpun, R.drawable.grandblue, R.drawable.slamdunk, R.drawable.kingdom, R.drawable.monogatari, R.drawable.twentythcentury, R.drawable.kaguyasama,
            R.drawable.vinlandsaga, R.drawable.ashitanojoe, R.drawable.haikyuu, R.drawable.welcometotheclassroomofthe2ndyear, R.drawable.monogatari2ndseason, R.drawable.gto, R.drawable.threegatsu};

    String[] mangaDescriptions = { "Guts, a former mercenary now known as the Black Swordsman, is out for revenge. After a tumultuous childhood, he finally finds someone he respects and believes he can trust, only to have everything fall apart when this person takes away everything important to Guts for the purpose of fulfilling his own desires. Now marked for death, Guts becomes condemned to a fate in which he is relentlessly pursued by demonic beings. Setting out on a dreadful quest riddled with misfortune, Guts, armed with a massive sword and monstrous strength, will let nothing stop him, not even death itself, until he is finally able to take the head of the one who stripped him—and his loved one—of their humanity. ", "In the American Old West, the world's greatest race is about to begin. Thousands line up in San Diego to travel over six thousand kilometers for a chance to win the grand prize of fifty million dollars. With the era of the horse reaching its end, contestants are allowed to use any kind of vehicle they wish. Competitors will have to endure grueling conditions, traveling up to a hundred kilometers a day through uncharted wastelands. The Steel Ball Run is truly a one-of-a-kind event.\n" +
            "\n" +
            "The youthful Johnny Joestar, a crippled former horse racer, has come to San Diego to watch the start of the race. There he encounters Gyro Zeppeli, a racer with two steel balls at his waist instead of a gun. Johnny witnesses Gyro using one of his steel balls to unleash a fantastical power, compelling a man to fire his gun at himself during a duel. In the midst of the action, Johnny happens to touch the steel ball and feels a power surging through his legs, allowing him to stand up for the first time in two years. Vowing to find the secret of the steel balls, Johnny decides to compete in the race, and so begins his bizarre adventure across America on the Steel Ball Run. ", "Gol D. Roger, a man referred to as the \"Pirate King,\" is set to be executed by the World Government. But just before his demise, he confirms the existence of a great treasure, One Piece, located somewhere within the vast ocean known as the Grand Line. Announcing that One Piece can be claimed by anyone worthy enough to reach it, the Pirate King is executed and the Great Age of Pirates begins.\n" +
            "\n" +
            "Twenty-two years later, a young man by the name of Monkey D. Luffy is ready to embark on his own adventure, searching for One Piece and striving to become the new Pirate King. Armed with just a straw hat, a small boat, and an elastic body, he sets out on a fantastic journey to gather his own crew and a worthy ship that will take them across the Grand Line to claim the greatest status on the high seas.", "In 16th century Japan, Shinmen Takezou is a wild, rough young man, in both his appearance and his actions. His aggressive nature has won him the collective reproach and fear of his village, leading him and his best friend, Matahachi Honiden, to run away in search of something grander than provincial life. The pair enlist in the Toyotomi army, yearning for glory—but when the Toyotomi suffer a crushing defeat at the hands of the Tokugawa Clan at the Battle of Sekigahara, the friends barely make it out alive.\n" +
            "\n" +
            "After the two are separated, Shinmen returns home on a self-appointed mission to notify the Hon'iden family of Matahachi's survival. He instead finds himself a wanted criminal, framed for his friend's supposed murder based on his history of violence. Upon being captured, he is strung up on a tree and left to die. An itinerant monk, the distinguished Takuan Soho, takes pity on the \"devil child,\" secretly freeing Shinmen and christening him with a new name to avoid pursuit by the authorities: Musashi Miyamoto.\n" +
            "\n" +
            "Vagabond is the fictitious retelling of the life of one of Japan's most renowned swordsmen, the \"Sword Saint\" Musashi Miyamoto—his rise from a swordsman with no desire other than to become \"Invincible Under the Heavens\" to an enlightened warrior who slowly learns of the importance of close friends, self-reflection, and life itself.", "Kenzou Tenma, a renowned Japanese neurosurgeon working in post-war Germany, faces a difficult choice: to operate on Johan Liebert, an orphan boy on the verge of death, or on the mayor of Düsseldorf. In the end, Tenma decides to gamble his reputation by saving Johan, effectively leaving the mayor for dead.\n" +
            "\n" +
            "As a consequence of his actions, hospital director Heinemann strips Tenma of his position, and Heinemann's daughter Eva breaks off their engagement. Disgraced and shunned by his colleagues, Tenma loses all hope of a successful career—that is, until the mysterious killing of Heinemann gives him another chance.\n" +
            "\n" +
            "Nine years later, Tenma is the head of the surgical department and close to becoming the director himself. Although all seems well for him at first, he soon becomes entangled in a chain of gruesome murders that have taken place throughout Germany. The culprit is a monster—the same one that Tenma saved on that fateful day nine years ago.", "Alchemists are knowledgeable and naturally talented individuals who can manipulate and modify matter due to their art. Yet despite the wide range of possibilities, alchemy is not as all-powerful as most would believe. Human transmutation is strictly forbidden, and whoever attempts it risks severe consequences. Even so, siblings Edward and Alphonse Elric decide to ignore this great taboo and bring their mother back to life. Unfortunately, not only do they fail in resurrecting her, they also pay an extremely high price for their arrogance: Edward loses his left leg and Alphonse his entire body. Furthermore, Edward also gives up his right arm in order to seal his brother's soul into a suit of armor.\n" +
            "\n" +
            "Years later, the young alchemists travel across the country looking for the Philosopher's Stone, in the hopes of recovering their old bodies with its power. However, their quest for the fated stone also leads them to unravel far darker secrets than they could ever imagine.\n", "Punpun Onodera is a normal 11-year-old boy living in Japan. Hopelessly idealistic and romantic, Punpun begins to see his life take a subtle—though nonetheless startling—turn to the adult when he meets the new girl in his class, Aiko Tanaka. It is then that the quiet boy learns just how fickle maintaining a relationship can be, and the surmounting difficulties of transitioning from a naïve boyhood to a convoluted adulthood. When his father assaults his mother one night, Punpun realizes another thing: those whom he looked up to were not as impressive as he once thought.\n" +
            "\n" +
            "As his problems increase, Punpun's once shy demeanor turns into voluntary reclusiveness. Rather than curing him of his problems and conflicting emotions, this merely intensifies them, sending him down the dark path of maturity in this grim coming-of-age saga.", "Among the seaside town of Izu's ocean waves and rays of shining sun, Iori Kitahara is just beginning his freshman year at Izu University. As he moves into his uncle's scuba diving shop, Grand Blue, he eagerly anticipates his dream college life, filled with beautiful girls and good friends.\n" +
            "\n" +
            "But things don't exactly go according to plan. Upon entering the shop, he encounters a group of rowdy, naked upperclassmen, who immediately coerce him into participating in their alcoholic activities. Though unwilling at first, Iori quickly gives in and becomes the heart and soul of the party. Unfortunately, this earns him the scorn of his cousin, Chisa Kotegawa, who walks in at precisely the wrong time. Undeterred, Iori still vows to realize his ideal college life, but will things go according to plan this time, or will his situation take yet another dive?", "Hanamichi Sakuragi, a tall, boisterous teenager with flame-red hair and physical strength beyond his years, is eager to put an end to his rejection streak of 50 and finally score a girlfriend as he begins his first year of Shohoku High. However, his reputation for delinquency and destructiveness precedes him, and most of his fellow students subsequently avoid him like the plague. As his first day of school ends, he is left with two strong thoughts: \"I hate basketball\" and \"I need a girlfriend.\"\n" +
            "\n" +
            "Haruko Akagi, ignorant of Hanamichi's history of misbehavior, notices his immense height and unwittingly approaches him, asking whether or not he likes basketball. Overcome by the fact that a girl is speaking to him, the red-haired giant blurts out a yes despite his true feelings. At the gym, Haruko asks if he can do a slam dunk. Though a complete novice, Hanamachi palms the ball and makes the leap...but overshoots, slamming his head into the backboard. Amazed by his near-inhuman physical abilities, Haruko quickly notifies the school's basketball captain of his feat. With this, Hanamichi is unexpectedly thrust into a world of competition for a girl he barely knows, but he soon discovers that there is perhaps more to basketball than he once thought.", "During the Warring States period in China, Li Xin and Piao are two brother-like youngsters who dream of becoming Great Generals, despite their low status as orphaned slaves. One day, they encounter a man of nobility, who gives Piao an opportunity to undertake an important duty within the state of Qin's royal palace. Parting ways, Xin and Piao promise each other to one day become the greatest generals in the world. However, after a fierce coup d'état occurs in the palace, Xin meets with a dying Piao, whose last words spur him into action and lead him to encounter the young and soon-to-be king of Qin, Ying Zheng.\n" +
            "\n" +
            "Although initially on bad terms, Xin and Zheng become comrades and start on a path filled with trials and bloodshed. Zheng's objective is to bring all the warring states under Qin, and Xin seeks to climb to the very top of the army ranks. Against a backdrop of constant tactical battle between states and great political unrest, both outside and within the palace, the two endeavor towards their monumental ambitions that will change history forever.", "This is a story, a \"ghostory\" of sorts, about scars that bond, monsters that haunt, and fakes that deceive.\n" +
            "\n" +
            "The story of Koyomi Araragi begins through a fateful encounter with the all-powerful, blonde-haired, \"hot-blooded, iron-blooded and cold-blooded\" vampire, later introduced as Shinobu Oshino. Their tragic rendezvous results in the end of Araragi's life as a human and his subsequent rebirth as a vampire—a monster. However, this encounter is only the start of his meddlings with the supernatural. Koyomi's noble personality ultimately sees him getting further involved in the lives of others with supernatural afflictions. This is his desperate attempt at returning to a normal human life, in a paranormal world filled with nothing but tragedy, suffering, and inhumanity.", "As the 20th century approaches its end, people all over the world are anxious that the world is changing. And probably not for the better.\n" +
            "\n" +
            "Kenji Endo is a normal convenience store manager who's just trying to get by. But when he learns that one of his old friends going by the name \"Donkey\" has suddenly committed suicide, and that a new cult led by a figure known as \"Friend\" is becoming more notorious, Kenji starts to feel that something isn't right. With a few key clues left behind by his deceased friend, Kenji realizes that this cult is much more than he ever thought it would be—not only is this mysterious organization directly targeting him and his childhood friends, but the whole world also faces a grave danger that only the friends have the key to stop.\n" +
            "\n" +
            "Kenji's simple life of barely making ends meet is flipped upside down when he reunites with his childhood friends, and together they must figure out the truth of how their past is connected to the cult, as the turn of the century could mean the possible end of the world.", "Considered a genius due to having the highest grades in the country, Miyuki Shirogane leads the prestigious Shuchiin Academy's student council as its president, working alongside the beautiful and wealthy vice president Kaguya Shinomiya. The two are often regarded as the perfect couple by students despite them not being in any sort of romantic relationship.\n" +
            "\n" +
            "However, the truth is that after spending so much time together, the two have developed feelings for one another; unfortunately, neither is willing to confess, as doing so would be a sign of weakness. With their pride as elite students on the line, Miyuki and Kaguya embark on a quest to do whatever is necessary to get a confession out of the other. Through their daily antics, the battle of love begins!", "Thorfinn, son of one of the Vikings' greatest warriors, is among the finest fighters in the merry band of mercenaries run by the cunning Askeladd, an impressive feat for a person his age. However, Thorfinn is not part of the group for the plunder it entails—instead, for having caused his family great tragedy, the boy has vowed to kill Askeladd in a fair duel. Not yet skilled enough to defeat him, but unable to abandon his vengeance, Thorfinn spends his boyhood with the mercenary crew, honing his skills on the battlefield among the war-loving Danes, where killing is just another pleasure of life.\n" +
            "\n" +
            "One day, when Askeladd receives word that Danish prince Canute has been taken hostage, he hatches an ambitious plot—one that will decide the next King of England and drastically alter the lives of Thorfinn, Canute, and himself. Set in 11th century Europe, Vinland Saga tells a bloody epic in an era where violence, madness, and injustice are inescapable, providing a paradise for the battle-crazed and utter hell for the rest who live in it.", "Joe Yabuki is a troubled young man who runs away from an orphanage. Wandering through the Tokyo slums, he meets former boxing trainer Danpei. Joe is later arrested and goes to a temporary jail where he fights Nishi, his future best friend and leader of a group of hooligans. He and Nishi then go to a juvenile prison miles away from Tokyo. There Joe meets Rikiishi, a former boxing prodigy, and a rivalry develops between them. They face each other in a match in which Rikiishi dominates Joe until the latter hits him with a cross-counter, resulting in both being knocked out. This inspires the other prison inmates to take up boxing. Joe and Rikiishi vow to fight again.", "The whistle blows. The ball is up. A dig. A set. A spike.\n" +
            "\n" +
            "Volleyball. A sport where two teams face off, separated by a formidable, wall-like net.\n" +
            "\n" +
            "The \"Little Giant,\" standing at only 170 cm, overcomes the towering net and the wall of blockers. The awe-inspired Shouyou Hinata looks on at the ace's crow-like figure. Determined to reach great heights like the Little Giant, small-statured Hinata finally manages to form a team in his last year of junior high school, and enters his first volleyball tournament. However, his team is utterly defeated in their first game against the powerhouse school Kitagawa Daiichi, led by the genius, but oppressive setter dubbed the \"King of the Court,\" Tobio Kageyama.\n" +
            "\n" +
            "Hinata enrolls into Karasuno High School seeking to take revenge against Kageyama in an official high school match and to follow in the Little Giant's footsteps—but his plans are ruined when he opens the gymnasium door to find Kageyama as one of his teammates.\n" +
            "\n" +
            "Now, Hinata must establish himself on the team and work alongside the problematic Kageyama to overcome his shortcomings and to fulfill his dream of making it to the top of the high school volleyball world.", "This is a story. A story about choices and consequences, confessions resulting in love and rejection, and decisions leading to sacrifice and tragedy.\n" +
            "\n" +
            "Koyomi Araragi's decision to save a blonde vampire and meddle with the supernatural resulted in his death as a human and rebirth as a monster. But this was only one of the countless tragedies and choices that Koyomi would be faced with, and he is confronted with the fact that his seemingly unshakeable and hard-earned relationships do not last. As strange oddities continue to manifest in the world around him, he is faced with impossible choices—to sever his ties with those he loves, or eternally remain a part of the world of monsters and apparitions and watch the world crumble as a result. To accept or reject a confession, and sacrifice his all for the sake of others. However, both of these paths could lead to tragedy and farewells.\n" +
            "\n" +
            "This is a story. A story about Koyomi Araragi coming to realize the consequences of his choices.", "22-year-old Eikichi Onizuka: pervert, former gang member... and teacher?\n" +
            "\n" +
            "Great Teacher Onizuka follows the incredible, though often ridiculous, antics of the titular teacher as he attempts to outwit and win over the cunning Class 3-4 that is determined to have him removed from the school. However, other obstacles present themselves throughout—including the frustrated, balding vice principal, Hiroshi Uchiyamada; old enemies from his biker days; and his own idiotic teaching methods. But Eikichi fights it all whilst trying to help his students, romance fellow teacher Azusa Fuyutsuki, and earn his self-proclaimed title.\n", "Rei Kiriyama is an extraordinary shogi player. Among the few elites to have gone professional as a middle school student, he is considered a genius. But what lies behind his prodigious facade is a teenage boy who suffers immense pressure from both his family, and from the high expectations from the shogi community. Rei moves out to live a more independent life away from his family, but his unorganized lifestyle and unsociable personality show no signs of improvement.\n" +
            "\n" +
            "However, in a twist of fate that will prove to be a turning point in his life, Rei then encounters the Kawamoto sisters—the motherly Akari, the passionate Hinata, and the energetic Momo—who take great care of him. 3-gatsu no Lion tells the story of Rei as he reshapes his melancholic life and picks up the courage to begin facing the problems he evaded during his past.","Rei Kiriyama is an extraordinary shogi player. Among the few elites to have gone professional as a middle school student, he is considered a genius. But what lies behind his prodigious facade is a teenage boy who suffers immense pressure from both his family, and from the high expectations from the shogi community. Rei moves out to live a more independent life away from his family, but his unorganized lifestyle and unsociable personality show no signs of improvement.\n" +
            "\n" +
            "However, in a twist of fate that will prove to be a turning point in his life, Rei then encounters the Kawamoto sisters—the motherly Akari, the passionate Hinata, and the energetic Momo—who take great care of him. 3-gatsu no Lion tells the story of Rei as he reshapes his melancholic life and picks up the courage to begin facing the problems he evaded during his past."};



    GridView gridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_most_popular, container, false);

        gridView = (GridView) v.findViewById(R.id.mostPopularGridView);

        GridViewCustomAdapter customAdapter = new GridViewCustomAdapter();
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity().getApplicationContext(), GridItemMostPopular.class);

                intent.putExtra("mangaTitle", mangaTitles[position]);
                intent.putExtra("mangaImage", mangaImages[position]);
                intent.putExtra("mangaDescriptions", mangaDescriptions[position]);
                startActivity(intent);
            }
        });
        return v;
    }

    private class GridViewCustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return mangaImages.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.grid_view_data, null);
         //   TextView mangaTitle = view.findViewById(R.id.mangaName);
            ImageView mangaImage = view.findViewById(R.id.mangaImage);

          //  mangaTitle.setText(mangaTitles[position]);
            mangaImage.setImageResource(mangaImages[position]);

            return view;
        }
    }
}