import './App.css';
import Header from './components/header/Header';
import TaskLine from './components/taskLine/TaskLine';
import "./models/Task.js"
import Task from './models/Task';
import Home from './pages/Home.jsx';

function App() {

  return (
    <div className="App">
      <Home />
    </div>
  );
}

export default App;
