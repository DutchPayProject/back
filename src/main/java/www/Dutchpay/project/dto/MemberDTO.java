package www.Dutchpay.project.dto;

import lombok.Data;

@Data
public class MemberDTO {

    private int device_id;
    private int group_id;
    private int list_id;
    private int member_id;
    private String member;

    private int money_list;
}
