import java.util.*;


public class demo {


public demo() {}


public static void main(String args[]) {

String poem[] = {"Zillions words I have in my heart to say and all of them are true",

"Again I'm sitting with pen in my hand and paper in front of me",

"Carefully I'm choosing the words to write",

"Breaking all the doors, trying to set my feelings free",

"My life means nothing when you're apart",

"To you I hope to be always near",

"Don't want to keep anything inside", 

"Guessed it's easy but it's not in any way",

"Everything inside me I want to say",

"For so long I've been trying day after day",

"How hard I tried to tell you,",

"In every way but I couldn't do so",

"Just simple words I have to write",

"My life means nothing when you're apart",

"Kinda magical words that'll make everything right",

"Love you deeply from the bottom of my heart",

"No one but you can make me feel that complete",

"Ooh, my love we are meant to be, that's our fate",

"Please stay with me for always and forever",

"Quit anything but leave me never",

"Right inside my heart you will always be",

"So happy I feel when you are with me",

"Unique is the way along you, I feel", 

"Very happy, flying without wings",

"What a joy, to my heart, your touch brings",

"X-tremly perfect I feel near you",

"Yes my love, that's what I want you to know"};

List newlist = new ArrayList(Arrays.asList(poem));

Collections.sort(newlist);

int size = newlist.size();

for(int i = 0; i < size; i++) {

System.out.println(newlist.get(i));

}

}

}
