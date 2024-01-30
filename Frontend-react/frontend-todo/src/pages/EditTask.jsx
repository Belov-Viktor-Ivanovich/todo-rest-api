import React from 'react'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

export default function EditTask() {
	return (
		<div className="App">
			<Router>
				<Routes>
					<Route path="/" element={<Home />}></Route>
					<Route path="/" element={<EditTask />}></Route>
				</Routes>
			</Router>
		</div>
	)
}
export default App;