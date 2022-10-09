public class Solution {
    public bool IsIsomorphic(string str1, string str2) {
        Dictionary<char, char> charCount
            = new Dictionary<char, char>();
        char c = 'a';
        for (int i = 0; i < str1.Length; i++) {
            if (charCount.ContainsKey(str1[i])
                && charCount.TryGetValue(str1[i], out c)) {
                if (c != str2[i])
                    return false;
            }
            else if (!charCount.ContainsValue(str2[i])) {
                charCount.Add(str1[i], str2[i]);
            }
            else {
                return false;
            }
        }
        return true;
    }
}