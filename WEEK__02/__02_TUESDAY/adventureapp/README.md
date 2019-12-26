# Adventure

### PLANNING

Options for
1. Room have references to "neighboring" rooms
2. Room manager / "Grid" that handles movement

Room
- Potential Directions
- Test prompt

Other considerations
- Persist Rooms in DB
- ** Don't rely on existing in a console app

Notes:
- Repeated retry options
- Add logic to controller for setup?

Grid needs:
- Data structure for rooms: Map<Coordinates, Room)
  Room[][]
  "Weaved" LinkedLists
  List<List<Room>>
  LinkedHashSet<LinkedHashSet<Room>>
