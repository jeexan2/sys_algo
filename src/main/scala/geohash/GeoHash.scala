package geohash

class GeoHash  {
  //Geohash is a geocoding system invented by Gustavo Niemeyer. Geohashes are
  //base32-encoded strings that represent a 2D box. The box is subdivided into
  //sub-boxes, each of which is represented by a single base32 character. The
  // box is defined by its south-west and north-east corners. The box is
  // subdivided by splitting it at the midpoint of its longest side. The
  // resulting sub-boxes are then subdivided recursively, until the desired
  // precision is reached.
}
