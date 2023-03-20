import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
    int answer = 0;
    for (String skillTree : skill_trees) {
      skillTree = skillTree.replaceAll("[^"+skill+"]", "");
      if(skill.indexOf(skillTree) == 0) answer++;
    }
    return answer;
  }
}