import './styles.css';

import { Link } from 'react-router-dom';
import {
    FaGithub,
    FaFacebook,
    FaInstagram,
    FaLinkedinIn,
    FaRegEnvelope
} from 'react-icons/fa'; //yarn add react-icons
import sun from '../../assets/img/sun.png';

const Footer = () => {
    const generateDateString = () => {
        const creationYear = '2021';
        const currentYear = `${new Date().getFullYear()}`;
        return creationYear === currentYear ? currentYear : `${creationYear} - ${currentYear}`;
    }

    return (
        <>
            <footer className='footer' id="footer">
                <div className='caixaf'>
                    <div className="parallelogram1f"></div>
                    <div className="parallelogram2f"></div>
                    <div className="parallelogram3f"></div>
                    <div className="parallelogram4f"></div>
                </div>
                <div className='container-footer'>
                    <div className='caixa-social'>
                        <Link className=' ' to="https://github.com/lipollis" rel="noreferrer">
                            <FaGithub className='rede-social' /></Link>

                        <Link className=' ' to="https://www.instagram.com/alinepollis/" rel="noreferrer">
                            <FaInstagram className='rede-social' /></Link>

                        <Link className=' ' to="https://www.facebook.com/aline.pollis/" rel="noreferrer">
                            <FaFacebook className='rede-social' /></Link>

                        <Link className=' ' to="https://www.linkedin.com/in/alinepollisbeck/" rel="noreferrer">
                            <FaLinkedinIn className='rede-social' /></Link>

                        <Link className=' ' to="mailto:aline.pollis@hotmail.com" rel="noreferrer">
                            <FaRegEnvelope className='rede-social' /></Link>
                    </div>

                    <div className='rodape'>
                        <h3>Aline Pollis &copy; Copyright {generateDateString()}</h3>
                    </div>

                    <div className=''>
                        <img className="assin" src={sun} alt="Minha foto." />
                    </div>
                </div>
            </footer >


        </>
    );
}

export default Footer;