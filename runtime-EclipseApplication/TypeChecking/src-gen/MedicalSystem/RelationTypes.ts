export type RelationTypes = {
relationName: string
from: DroneTypes | ActionTypes | DroneGroupTypes | MissionTypes
to: DroneTypes | ActionTypes | DroneGroupTypes | ConstraintTypes | MissionTypes
relationType: string
}
