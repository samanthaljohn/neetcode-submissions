class Solution {
public:
    int countSeniors(vector<string>& details) {
        int old_people = 0;
        
        for(string detail : details){
            string age = detail.substr(11, 2);

            if (stoi(age) > 60){
                old_people++;
            }
        }

        return old_people;
    }
};