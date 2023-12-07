package dto;

import java.io.Serializable;

/**
 * WikiDtoクラス
 * wikiデータを一つ持てるdata object(dto)
 * Java Beansの定石通り直列化用インターフェース実装
 * @author　Say Consulting Group
 * @version　1.0.0
 */
public class WikiDto implements Serializable {

  /** 題名 */
  private String title;
  /** 本文 */
  private String body;

  /**
   * 引数に題名と本文指定するコンストラクタ
   * 題名と本文が設定されたdtoインスタンスを生成する
   * @param title wiki題名
   * @param body wiki本文
   */
  public WikiDto(String title, String body) {
    // wiki題名をtitleフィールドに設定
    this.title = title;

    // wiki本文をbodyフィールドに設定
    this.body = body;
  }

  /**
   * toStringメソッド
   * wikiの題名と本文を含む文字列を返す
   * @return 題名 + 改行 + wiki本文
   */
  public String toString() {
    return this.title + "\n" + this.body + "\n\n";
  }
}
