package geohash

class GeoHash  {
  //Geohash is a geocoding system invented by Gustavo Niemeyer. Geohashes are
  //base32-encoded strings that represent a 2D box. The box is subdivided into
  //sub-boxes, each of which is represented by a single base32 character. The
  // box is defined by its south-west and north-east corners. The box is
  // subdivided by splitting it at the midpoint of its longest side. The
  // resulting sub-boxes are then subdivided recursively, until the desired
  // precision is reached.

  //The geohash is a string of base32 characters. The characters are ordered
  // from left to right, and the first character represents the most significant
  // bit of the hash. The last character represents the least significant bit.
  //  The bits are ordered from left to right, and the first bit represents the
  //  most significant bit of the hash. The last bit represents the least
  //  significant bit.

  //Implementation of geohash in scala
  //http://en.wikipedia.org/wiki/Geohash
  //http://en.wikipedia.org/wiki/Geohash#Algorithm_and_example


}
