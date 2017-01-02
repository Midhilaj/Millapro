package com.createvirtualshop.millapro;

/**
 * Created by test on 12/31/16.
 */

public class MillaTfilter {

    public static String getClearText(String UnChecking_string) throws MillaE {
        if (UnChecking_string.trim().length() < 1 || UnChecking_string == null || UnChecking_string.isEmpty()) {
            // throw our custom exception
            throw new MillaE("invalied string ");
        } else {

             String p1[]={"boobs","bra","д","и","ж","Ч","Б",".,","?,","[url=","[/url]","thx","sex","byob","nude","loan","debt","poze","bdsm","soma","visa","hotel","paxil","anime","naked","poker","coolhu","cialis","incest","casino","dating","payday","rental","ambien","holdem","cialis","adipex","booker","youtube","myspace","advicer","flowers","finance","freenet","-online","shemale","meridia","cumshot","trading","adderall","gambling","roulette","top-site","mortgage","pharmacy","dutyfree","ownsthis","duty-free","insurance","ringtones","insurance","blackjack","hair-loss","bllogspot","baccarrat","thorcarlson","jrcreations","creditcard","macinstruct","hydrocodone","leading-site","slot-machine","carisoprodol","ottawavalleyag","cyclobenzaprine","discreetordering","aceteminophen","augmentation","enhancement","phentermine","doxycycline","citalopram","cephalaxin","vicoprofen","lorazepam","oxycontin","oxycodone","percocet","propecia","tramadol","propecia","percocet","cymbalta","lunestra","fioricet","lesbian","lexapro","valtrex","titties","xenical","meridia","levitra","vicodin","ephedra","lipitor","breast","cyclen","viagra","valium","hqtube","ultram","clomid","cyclen","vioxx","zolus","pussy","porno","xanax","bitch","penis","pills","male","porn","dick","cock","tits","fuck","shit","gay","ass","gdf","gds"};


            String[] words = UnChecking_string.split("\\s+");
            for(int i=0;i<words.length;i++){
                for(int j=0;j<p1.length;j++){
                    String temps=words[i].replaceAll("[^a-zA-Z]", "");
                    //temps=temps.replace(".","");

                    if(temps.contains(p1[j])){
                        String temp2="";
                        for(int kl=0;kl<p1[j].length();kl++){
                            if(temps.length() > 1 && kl ==0){
                                temp2=temp2+temps.substring(0,1);

                            }
                            else temp2=temp2+"*";
                        }
                        words[i]=temps.replace(p1[j],temp2);
                    }
                }
            }
            String mChecckedString="";
            for(int k=0;k<words.length;k++)
                mChecckedString+=(words[k]+" ");
            return mChecckedString;
        }
    }
}