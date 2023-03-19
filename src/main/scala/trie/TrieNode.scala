package trie

class TrieNode {
  // Initialize your data structure here.
  var children = Array.fill[Option[TrieNode]](26)(None)
  var isWord = false
  //list functions of children
  def getChildren = children
  def setChildren(children: Array[Option[TrieNode]]) = this.children = children
  def getIsWord = isWord
  def setIsWord(isWord: Boolean) = this.isWord = isWord



}
