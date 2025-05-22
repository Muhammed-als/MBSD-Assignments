
export const droneAlpha: DroneTypes = {
				droneName: "droneAlpha", ip: "127.0.0.1", serialNumber: "SN1"
			};
export const droneBeta: DroneTypes = {
				droneName: "droneBeta", ip: "127.0.0.1", serialNumber: "SN2"
			};
export const droneGroupAlpha: DroneGroupTypes = {
				droneGroupName: "droneGroupAlpha", drones: [
								droneAlpha, droneBeta
							]
			};
export const firstAction: ActionTypes = {
				actionName: "firstAction", description: "Description", actionType: "Scan"
			};
export const firstConstraint: ConstraintTypes = {
				constraintName: "firstConstraint", description: "Description"
			};
export const firstPermissionConstraint: ConstraintTypes = {
				constraintName: "firstPermissionConstraint", description: "Description"
			};
export const firstRegulatoryConstraint: ConstraintTypes = {
				constraintName: "firstRegulatoryConstraint", description: "Description"
			};
export const betaMission: MissionTypes = {
				missionName: "BetaMission", droneGroup: droneGroupAlpha, actions: [
								firstAction
							], constraints: [
								firstPermissionConstraint, firstRegulatoryConstraint
							]
			};
export const alphaMission: MissionTypes = {
				missionName: "alphaMission", droneGroup: droneGroupAlpha, actions: [
								firstAction
							], constraints: [
								firstPermissionConstraint, firstRegulatoryConstraint
							]
			};
export const inheritSafetyConstraint: RelationTypes = {
				relationName: "inheritSafetyConstraint", from: firstPermissionConstraint, to: firstConstraint, relationType: "Inherits"
			};
export const inheritRegulatoryConstraint: RelationTypes = {
				relationName: "inheritRegulatoryConstraint", from: firstRegulatoryConstraint, to: firstConstraint, relationType: "Inherits"
			};

console.log(droneAlpha);
console.log(droneBeta);
console.log(droneGroupAlpha);
console.log(firstAction);
console.log(firstConstraint);
console.log(firstPermissionConstraint);
console.log(firstRegulatoryConstraint);
console.log(betaMission);
console.log(alphaMission);
console.log(inheritSafetyConstraint);
console.log(inheritRegulatoryConstraint);
