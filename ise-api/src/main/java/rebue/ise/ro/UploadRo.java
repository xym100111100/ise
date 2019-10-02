package rebue.ise.ro;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import rebue.ise.dic.UploadResultDic;

/**
 * 上传文件的返回结果
 */
@JsonInclude(Include.NON_NULL)
public class UploadRo {
    /**
     * 上传文件返回结果的代码
     */
    private UploadResultDic result;
    /**
     * 上传文件返回结果的代码信息
     */
    private String          msg;

    /**
     * 上传文件的路径
     */
    private String   filePath;

    public UploadResultDic getResult() {
        return result;
    }

    public void setResult(UploadResultDic result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "UploadRo [result=" + result + ", msg=" + msg + ", filePath=" + filePath + "]";
    }

}
