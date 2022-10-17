package pro.goforit.generator.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName article
 */
public class Article implements Serializable {
    /**
     * 文章id
     */
    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 一级类目
     */
    private String categoryLevel1;

    /**
     * 二级类目
     */
    private String categoryLevel2;

    /**
     * 三级目录
     */
    private String categoryLevel3;

    /**
     * 四级目录
     */
    private String categoryLevel4;

    /**
     * 内容
     */
    private String content;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateUser;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 热度
     */
    private Long heat;

    /**
     * 是否为转载
     */
    private Integer ifReprinted;

    /**
     * 装载链接
     */
    private String reprintedLink;

    /**
     * 是否置顶
     */
    private Integer ifTop;

    /**
     * 是否首页置顶
     */
    private Integer ifHomePageTop;

    /**
     * 封面图片
     */
    private String coverImageUrl;

    /**
     * 是否为文章：
 false: 下载目录
     */
    private Integer ifArticle;

    /**
     * 关键字
     */
    private String keywords;

    /**
     * 文件是否现行
     */
    private Integer ifDisable;

    /**
     * 文件编号
     */
    private String fileNum;

    /**
     * 文件下载权限
     */
    private String downloadRole;

    /**
     * 语言
     */
    private String lang;

    /**
     * 纯文本的content
用于检索
     */
    private String plainText;

    private static final long serialVersionUID = 1L;

    /**
     * 文章id
     */
    public String getId() {
        return id;
    }

    /**
     * 文章id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 一级类目
     */
    public String getCategoryLevel1() {
        return categoryLevel1;
    }

    /**
     * 一级类目
     */
    public void setCategoryLevel1(String categoryLevel1) {
        this.categoryLevel1 = categoryLevel1;
    }

    /**
     * 二级类目
     */
    public String getCategoryLevel2() {
        return categoryLevel2;
    }

    /**
     * 二级类目
     */
    public void setCategoryLevel2(String categoryLevel2) {
        this.categoryLevel2 = categoryLevel2;
    }

    /**
     * 三级目录
     */
    public String getCategoryLevel3() {
        return categoryLevel3;
    }

    /**
     * 三级目录
     */
    public void setCategoryLevel3(String categoryLevel3) {
        this.categoryLevel3 = categoryLevel3;
    }

    /**
     * 四级目录
     */
    public String getCategoryLevel4() {
        return categoryLevel4;
    }

    /**
     * 四级目录
     */
    public void setCategoryLevel4(String categoryLevel4) {
        this.categoryLevel4 = categoryLevel4;
    }

    /**
     * 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新人
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 更新人
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 热度
     */
    public Long getHeat() {
        return heat;
    }

    /**
     * 热度
     */
    public void setHeat(Long heat) {
        this.heat = heat;
    }

    /**
     * 是否为转载
     */
    public Integer getIfReprinted() {
        return ifReprinted;
    }

    /**
     * 是否为转载
     */
    public void setIfReprinted(Integer ifReprinted) {
        this.ifReprinted = ifReprinted;
    }

    /**
     * 装载链接
     */
    public String getReprintedLink() {
        return reprintedLink;
    }

    /**
     * 装载链接
     */
    public void setReprintedLink(String reprintedLink) {
        this.reprintedLink = reprintedLink;
    }

    /**
     * 是否置顶
     */
    public Integer getIfTop() {
        return ifTop;
    }

    /**
     * 是否置顶
     */
    public void setIfTop(Integer ifTop) {
        this.ifTop = ifTop;
    }

    /**
     * 是否首页置顶
     */
    public Integer getIfHomePageTop() {
        return ifHomePageTop;
    }

    /**
     * 是否首页置顶
     */
    public void setIfHomePageTop(Integer ifHomePageTop) {
        this.ifHomePageTop = ifHomePageTop;
    }

    /**
     * 封面图片
     */
    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    /**
     * 封面图片
     */
    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    /**
     * 是否为文章：
 false: 下载目录
     */
    public Integer getIfArticle() {
        return ifArticle;
    }

    /**
     * 是否为文章：
 false: 下载目录
     */
    public void setIfArticle(Integer ifArticle) {
        this.ifArticle = ifArticle;
    }

    /**
     * 关键字
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 关键字
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * 文件是否现行
     */
    public Integer getIfDisable() {
        return ifDisable;
    }

    /**
     * 文件是否现行
     */
    public void setIfDisable(Integer ifDisable) {
        this.ifDisable = ifDisable;
    }

    /**
     * 文件编号
     */
    public String getFileNum() {
        return fileNum;
    }

    /**
     * 文件编号
     */
    public void setFileNum(String fileNum) {
        this.fileNum = fileNum;
    }

    /**
     * 文件下载权限
     */
    public String getDownloadRole() {
        return downloadRole;
    }

    /**
     * 文件下载权限
     */
    public void setDownloadRole(String downloadRole) {
        this.downloadRole = downloadRole;
    }

    /**
     * 语言
     */
    public String getLang() {
        return lang;
    }

    /**
     * 语言
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * 纯文本的content
用于检索
     */
    public String getPlainText() {
        return plainText;
    }

    /**
     * 纯文本的content
用于检索
     */
    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Article other = (Article) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getCategoryLevel1() == null ? other.getCategoryLevel1() == null : this.getCategoryLevel1().equals(other.getCategoryLevel1()))
            && (this.getCategoryLevel2() == null ? other.getCategoryLevel2() == null : this.getCategoryLevel2().equals(other.getCategoryLevel2()))
            && (this.getCategoryLevel3() == null ? other.getCategoryLevel3() == null : this.getCategoryLevel3().equals(other.getCategoryLevel3()))
            && (this.getCategoryLevel4() == null ? other.getCategoryLevel4() == null : this.getCategoryLevel4().equals(other.getCategoryLevel4()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getHeat() == null ? other.getHeat() == null : this.getHeat().equals(other.getHeat()))
            && (this.getIfReprinted() == null ? other.getIfReprinted() == null : this.getIfReprinted().equals(other.getIfReprinted()))
            && (this.getReprintedLink() == null ? other.getReprintedLink() == null : this.getReprintedLink().equals(other.getReprintedLink()))
            && (this.getIfTop() == null ? other.getIfTop() == null : this.getIfTop().equals(other.getIfTop()))
            && (this.getIfHomePageTop() == null ? other.getIfHomePageTop() == null : this.getIfHomePageTop().equals(other.getIfHomePageTop()))
            && (this.getCoverImageUrl() == null ? other.getCoverImageUrl() == null : this.getCoverImageUrl().equals(other.getCoverImageUrl()))
            && (this.getIfArticle() == null ? other.getIfArticle() == null : this.getIfArticle().equals(other.getIfArticle()))
            && (this.getKeywords() == null ? other.getKeywords() == null : this.getKeywords().equals(other.getKeywords()))
            && (this.getIfDisable() == null ? other.getIfDisable() == null : this.getIfDisable().equals(other.getIfDisable()))
            && (this.getFileNum() == null ? other.getFileNum() == null : this.getFileNum().equals(other.getFileNum()))
            && (this.getDownloadRole() == null ? other.getDownloadRole() == null : this.getDownloadRole().equals(other.getDownloadRole()))
            && (this.getLang() == null ? other.getLang() == null : this.getLang().equals(other.getLang()))
            && (this.getPlainText() == null ? other.getPlainText() == null : this.getPlainText().equals(other.getPlainText()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getCategoryLevel1() == null) ? 0 : getCategoryLevel1().hashCode());
        result = prime * result + ((getCategoryLevel2() == null) ? 0 : getCategoryLevel2().hashCode());
        result = prime * result + ((getCategoryLevel3() == null) ? 0 : getCategoryLevel3().hashCode());
        result = prime * result + ((getCategoryLevel4() == null) ? 0 : getCategoryLevel4().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getHeat() == null) ? 0 : getHeat().hashCode());
        result = prime * result + ((getIfReprinted() == null) ? 0 : getIfReprinted().hashCode());
        result = prime * result + ((getReprintedLink() == null) ? 0 : getReprintedLink().hashCode());
        result = prime * result + ((getIfTop() == null) ? 0 : getIfTop().hashCode());
        result = prime * result + ((getIfHomePageTop() == null) ? 0 : getIfHomePageTop().hashCode());
        result = prime * result + ((getCoverImageUrl() == null) ? 0 : getCoverImageUrl().hashCode());
        result = prime * result + ((getIfArticle() == null) ? 0 : getIfArticle().hashCode());
        result = prime * result + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        result = prime * result + ((getIfDisable() == null) ? 0 : getIfDisable().hashCode());
        result = prime * result + ((getFileNum() == null) ? 0 : getFileNum().hashCode());
        result = prime * result + ((getDownloadRole() == null) ? 0 : getDownloadRole().hashCode());
        result = prime * result + ((getLang() == null) ? 0 : getLang().hashCode());
        result = prime * result + ((getPlainText() == null) ? 0 : getPlainText().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", categoryLevel1=").append(categoryLevel1);
        sb.append(", categoryLevel2=").append(categoryLevel2);
        sb.append(", categoryLevel3=").append(categoryLevel3);
        sb.append(", categoryLevel4=").append(categoryLevel4);
        sb.append(", content=").append(content);
        sb.append(", remark=").append(remark);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", heat=").append(heat);
        sb.append(", ifReprinted=").append(ifReprinted);
        sb.append(", reprintedLink=").append(reprintedLink);
        sb.append(", ifTop=").append(ifTop);
        sb.append(", ifHomePageTop=").append(ifHomePageTop);
        sb.append(", coverImageUrl=").append(coverImageUrl);
        sb.append(", ifArticle=").append(ifArticle);
        sb.append(", keywords=").append(keywords);
        sb.append(", ifDisable=").append(ifDisable);
        sb.append(", fileNum=").append(fileNum);
        sb.append(", downloadRole=").append(downloadRole);
        sb.append(", lang=").append(lang);
        sb.append(", plainText=").append(plainText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}