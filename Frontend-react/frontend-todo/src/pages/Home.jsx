import React, { useEffect, useState } from 'react'
import Header from '../components/header/Header';
import TaskLine from '../components/taskLine/TaskLine';
import Task from '../models/Task';
import axios from 'axios';

export default function Home() {

	const [tasks, setTask] = useState([]);

	useEffect(() => {
		loadTask();
	}, [])

	

	const loadTask = async () => {
		const result = await axios.get(
			"http://localhost:8080/api/v0.1/tasks"
		);
		setTask(result.data);
	}


	

	return (
		<div className="container">
			<Header loadTask={()=>loadTask()}/>
			{
				tasks.map((task, id) => (
					<TaskLine
						task={task}
					/>
				))
			}



		</div>
	)
}
