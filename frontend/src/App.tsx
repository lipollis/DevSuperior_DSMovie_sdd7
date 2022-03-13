import { BrowserRouter, Routes, Route } from "react-router-dom";
// import { library } from '@fortawesome/fontawesome-svg-core'
// import { fab } from '@fortawesome/free-brands-svg-icons'
// import { faCheckSquare, faCoffee } from '@fortawesome/free-solid-svg-icons'

import Listing from './pages/Listing';
import Form from './pages/Form';
import Navbar from "./components/Navbar";
import Footer from "components/Footer";

// library.add(fab, faCheckSquare, faCoffee)

function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/" element={<Listing />} />
        <Route path="/form">
          <Route path=":movieId" element={<Form />} />
        </Route>
      </Routes>
      <Footer />
    </BrowserRouter>
  );
}

export default App;
