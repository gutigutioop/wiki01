package app;

import java.util.ArrayList;
import java.util.List;

import dto.WikiDto;

/**
 * ファイルベースWikiアプリ
 * 
 * Wikiアプリ開発01 - wikiを一つ持てるData Object(JavaBean)を作ろう！
 *
 * Mainクラス
 * ファイルベースWikiアプリの実行エントリポイントを持つクラス
 * @author　Say Consulting Group
 * @version　1.0.0
 */
public class Main {
    
  /**
   * mainメソッド
   * Wikiアプリの実行エントリポイント
   * @param args コマンドライン引数(未使用)
   */
  public static void main(String[] args) {
    // WikiDtoのArrayListを生成する
    List<WikiDto> list = new ArrayList<WikiDto>();
    for (int i = 0; i < wiki.length;) {
      String title = wiki[i++];
      String body = wiki[i++];
      WikiDto wd = new WikiDto(title, body);
      list.add(wd);
    }
    
    // 全てのwikiを表示する
    for (WikiDto item : list) {
      System.out.println(item);
    }
  }
  
  /**
   * wikiの配列
   * """で括ると、改行を含むStringを記述することができる
   */
  private static final String wiki[] = {
    "DB-一対一の関係",
    """
    usersとprofilesというテーブルがあり、一人のユーザーが一つのプロフィールを持っているとする。
    このような関係を、一対一と呼ぶ。
    この場合は、profilesテーブルにuser_idという名前でusersテーブルのidを持たせることで、どのプロフィールのデータがどのユーザーに所属するかを表現する。 
    """,
    
    "DB-一対多の関係",
    """
    usersとpostsというテーブルがあり、一人のユーザーがいくつも投稿ができるとする。
    このような関係を、usersとpostsは、一対多の関係にある、と言う。
    この場合は、postsテーブルにuser_idという名前でusersテーブルのidを持たせることで、どの投稿がどのユーザーに所属するかを表現する。
    """,
    
    "DB-多対多の関係",
    """
    usersとpostsというテーブルがあり、usersとpostsが一対多の関係にあるとする。
    このDBに、「いいね！」のデータを追加する場合、多数のユーザーが多数の投稿にいいねをつけることができるので、usersとpostsのテーブルだけでは、これを表現することができない。
    よって、どのユーザーがどの投稿に対して「いいね」をしたか、を保存するためのテーブルを別途作成する。
    これを中間テーブルと呼ぶ。
    この場合、usersとpostsは、いいねの中間テーブルを介して多対多の関係にある、と言う。
    """,
    
    "gitとGitHub",
    """
    gitは自分のPC上でファイルの変更履歴を一言一句間違いなく記録していくツール。
    業界用語ではバージョン管理ツールと呼ばれる。
    
    GitHubは、gitで保存している変更履歴ごと、プロジェクトをネット上にある領域にまるごと保存する場所。
    主にグループ開発に使われる。
    """,
    
    "メモリ領域-スタック",
    """
    スタック領域には、次の処理の場所や、メソッドに渡す引数が先入れ後出し法で格納される。
    3つの引数を渡すメソッドを呼ぶ時は、メソッド処理後の戻り先、第一引数、第二引数、第三引数の順番にスタックにデータが積まれる。
    スタックにデータを積むことをプッシュと呼ぶ。
    呼ばれたメソッドは自分が使う3つの引数をスタックから取り出して処理を行う。
    スタックからデータを取り出すことをポップと呼ぶ。

    """,
    
    "メモリ領域-ヒープ",
    """
    ヒープ領域は、必要に応じてアプリケーションがOSから借りてくるメモリ領域。
    クラスから生成されるインスタンスは、この領域に実体化する。
    インスタンスは不要になれば順次ガベージコレクションによってヒープ領域から削除され、メモリが解放される。
    """,
  };
}
