package chapter06_conditionbranch.elsekeyword.v3;

import chapter06_conditionbranch.elsekeyword.HealthCondition;
import chapter06_conditionbranch.elsekeyword.Member;

public class ElseLogic {
  Member member;
  HealthCondition method() {
    float hitPointRate = member.hitPoint / member.maxHitPoint;

    if (hitPointRate == 0) return HealthCondition.dead;
    if (hitPointRate < 0.3) return HealthCondition.danger;
    if (hitPointRate < 0.5) return HealthCondition.caution;

    return HealthCondition.fine;
  }
}
