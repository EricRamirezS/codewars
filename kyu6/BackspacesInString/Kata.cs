public class Kata
{
  public static string CleanString(string s)
  {
    string res = "";
    for (int i = 0 ;  i < s.Length; i++){
        if (s[i]=='#')res = res.Substring(0, res.Length-1>-1?res.Length-1:0);
        else res = res+s[i];
    }
    return res;
  }
}