package xianzhan.frame.json.jackson.pojo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import xianzhan.frame.json.jackson.ser.IntToBinarySer;

/**
 * @author xianzhan
 * @since 2023-06-08
 */
@Data
public class IntToBinary {

    @JsonSerialize(using = IntToBinarySer.class)
    private Integer num;
}
