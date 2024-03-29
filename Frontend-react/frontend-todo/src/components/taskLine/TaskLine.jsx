import React from 'react'
import "../../models/Task.js"
import Task from '../../models/Task'
import "./TaskLine.css"
import { faCheck, faPencil, faTrash } from "@fortawesome/free-solid-svg-icons"
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome"

export default function TaskLine(props) {
	let task = props.task;
	const done = {
		textDecoration: "line-through"
	}
	const inProcess = {
		textDecoration: "none"
	}
	return (
		<div className="taskLine">
			<div className="taskLine_el">{task.id}</div>
			<div className="taskLine_el description" style={task.status ?
				inProcess : done}>{task.description}</div>
			<div className="taskLine_el">{task.openTask}</div>
			<div className="taskLine_el">{task.closeTask}</div>
			<FontAwesomeIcon className="taskLine_el_icon" icon={faPencil} />
			<FontAwesomeIcon className="taskLine_el_icon" icon={faCheck} />
			<FontAwesomeIcon className="taskLine_el_icon" icon={faTrash} />

		</div>
	)
}
